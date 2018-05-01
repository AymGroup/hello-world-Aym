package presentation;

import java.util.List;


import com.opensymphony.xwork2.ActionSupport;

import metier.entities.Profil;
import service.IService;
import service.ServiceProfilImpl;

public class ProfilAction extends ActionSupport{

	private IService<Profil> service=new ServiceProfilImpl();
	//**** Le nom de l'input texte
	private Long numProfil;
	private String libelle; 
	private String descProfil;
	private List<Profil> profils;
	

	public String ajouter() {
		Profil p=new Profil(libelle,descProfil);
		boolean b=service.ajouter(p);
		
		if(b) {
			return "success";
		}else
			return "error";
	}
	
	public String delete() {
		String rep;
		boolean b=service.supprimer(numProfil);
		if(b) {
			rep=listAll();
			return rep;
		}else
			return "error";
	}
	
	//**** Edit Profil
	public String modifier() {
		//Long id=getNumProfil();
		Profil p=new Profil(numProfil,libelle,descProfil);
		boolean b=service.modifier(p);
		if(b) {
			return "success";
		}else
			return "error";
	}
	
	//**** Get Profil
	public String edit() {
		Profil p=service.getElement(numProfil);
		if(p!=null) {
			numProfil=p.getId();
			libelle=p.getLibelle();
			descProfil=p.getDescription();
			return "success";
		}else
			return "error";
	}
	
	
	
	public String listAll() {
		profils=service.listAll();
		if(profils!=null) {
			return "success";
		}else
			return "error";
	}
	
	public String listExport() {
		profils=service.listAll();
		if(profils!=null) {
			return "success";
		}else
			return "error";
	}
	
	//**** find by libelle
	
	public String findBy() {
		
		profils=service.getElementBy(libelle);
		if(profils!=null) {
			return "success";
		}else
			return "error";
	}
	
	//**** forwarding

	public String redirect() {
		return SUCCESS;
	}
		
	//**** Gettes & Setters for inputs fields 
	
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public Long getNumProfil() {
		return numProfil;
	}

	public void setNumProfil(Long numProfil) {
		this.numProfil = numProfil;
	}

	public List<Profil> getProfils() {
		return profils;
	}

	public void setProfils(List<Profil> profils) {
		this.profils = profils;
	}

	public String getDescProfil() {
		return descProfil;
	}

	public void setDescProfil(String descProfil) {
		this.descProfil = descProfil;
	}


}
