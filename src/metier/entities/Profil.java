package metier.entities;

import java.util.HashSet;
import java.util.Set;

public class Profil {
	
	private Long id;
	private String libelle;
	private String description;
	
	//private Set<User> su;
	//private Set<Fonctionnalite> fcts;
	private Fonctionnalite fonction;
	
	public Profil() {
		
	}
	
	public Profil(Long id, String libelle,String description) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description=description;
	}

	public Profil(String libelle,String description) {
		super();
		this.description=description;
		this.libelle = libelle;
	}
	/*
	public Set<Fonctionnalite> getFcts() {
		return fcts;
	}
	public void setFcts(Set<Fonctionnalite> fcts) {
		this.fcts = fcts;
	}
	*/
	
	/*
	public Set<User> getSu() {
		return su;
	}
	public void setSu(Set<User> su) {
		this.su = su;
	}*/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Fonctionnalite getFonction() {
		return fonction;
	}
	public void setFonction(Fonctionnalite fonction) {
		this.fonction = fonction;
	}
	
}
