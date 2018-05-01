package presentation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;

import metier.entities.Fonctionnalite;
import metier.entities.Profil;
import service.IService;
import service.ServiceFonctImpl;
import service.ServiceProfilImpl;

public class FonctAction extends ActionSupport {
	
	private Fonctionnalite bean;
	private IService<Fonctionnalite> serviceFonct=new ServiceFonctImpl();
	private IService<Profil> serviceProfil=new ServiceProfilImpl();
	
	private Long idFonct;
	private Long idProfil;
	private List<Fonctionnalite> foncts;
	private List<Profil> profils;
	
	//** Ajouter Fonctionnalite
	public String ajouterFonct() {
		boolean rep=serviceFonct.ajouter(bean);
		if(rep) {
			return "success";
		}else
			return "error";
	}
	
	//** Get Fonct from table
	public String getFonct() {
		profils=serviceProfil.listAll();
		Fonctionnalite f=serviceFonct.getElement(idFonct);
		if(f!=null) {
			setBean(f);
			return "success";
		}else
			return "error";
	}
	
	//** Get All Fonct
	public String listerFonct() {
		foncts=serviceFonct.listAll();
		if(foncts!=null) {
			return "success";
		}else
			return "error";
	}
	
	//** Affect Profil To Functionality -> A revoir
	public String setFonctAffect(){
		Set<Profil> profils=new HashSet<Profil>();
		Profil p=serviceProfil.getElement(idProfil);
		
		if(p!=null){
			profils.add(p);
			bean.setProfils(profils);
			boolean rep=serviceFonct.modifier(bean);
			
			if(rep){
				foncts=serviceFonct.listAll();
				return "success";
			}else
				return "error";
		}else
			return "error";
	}
	
	//** Delete Functionality
	public String deleteFonct(){
		
		boolean rep=serviceFonct.supprimer(idFonct);
		
		if(rep){
			foncts=serviceFonct.listAll();
			return "success";
		}else
			return "error";
	}
	
	public String updateFonct(){
		Fonctionnalite f=new Fonctionnalite(bean.getId(),bean.getLibelle(),bean.getDescription());
		
		boolean rep=serviceFonct.modifier(f);
		
		if(rep){
			foncts=serviceFonct.listAll();
			return "success";
		}else
			return "error";
	}
	
	public String searchFonct(){
		foncts=serviceFonct.getElementBy(bean.getLibelle());
		if(foncts!=null) {
			return "success";
		}else
			return "error";
	}
	
	//********* Forwarding *********
	
	//** Redirect-To-Fonctionnalite edit Form
	public String editFonct(){
		Fonctionnalite f=serviceFonct.getElement(idFonct);
		if(f!=null) {
			setBean(f);
			return "success";
		}else
			return "error";
	}
	
	//** Redirect-To-Fonctionnalite
	public String redirectFonct() {
		return "success";
	}
	
	public String listerExport(){
		foncts=serviceFonct.listAll();
		return "success";
	}
	
	//** Getters & Setters
	public Fonctionnalite getBean() {
		return bean;
	}

	public void setBean(Fonctionnalite bean) {
		this.bean = bean;
	}

	public Long getIdFonct() {
		return idFonct;
	}

	public void setIdFonct(Long idFonct) {
		this.idFonct = idFonct;
	}

	public List<Fonctionnalite> getFoncts() {
		return foncts;
	}

	public void setFoncts(List<Fonctionnalite> foncts) {
		this.foncts = foncts;
	}

	public Long getIdProfil() {
		return idProfil;
	}

	public void setIdProfil(Long idProfil) {
		this.idProfil = idProfil;
	}

	public List<Profil> getProfils() {
		return profils;
	}

	public void setProfils(List<Profil> profils) {
		this.profils = profils;
	}

}
