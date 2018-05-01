package metier.entities;

import java.util.Set;

public class Fonctionnalite {
	private Long id;
	private String libelle;
	private String description;
	private Set<Profil> profils;
	
	public Set<Profil> getProfils() {
		return profils;
	}
	public void setProfils(Set<Profil> profils) {
		this.profils = profils;
	}
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
	
	public Fonctionnalite() {
		
	}
	public Fonctionnalite(String libelle,String description) {
		super();
		this.description=description;
		this.libelle = libelle;
	}
	
	public Fonctionnalite(Long id,String libelle,String description) {
		super();
		this.id=id;
		this.description=description;
		this.libelle = libelle;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
