package dao.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dao.DaoUserImpl;
import dao.IDao;
import metier.entities.Fonctionnalite;
import metier.entities.Profil;
import metier.entities.User;

public class TestDao {

	public static void main(String[] args) {
		
		//**** Association Many-To-One - Affectation d'un profil a un utilisateur 
		
		/*
		User u=new User("Aymen","123naruto");
		Profil p=new Profil("Administrateur");
		u.setProfil(p);
		dao.insert(u);
		*/
		
		
		//**** Association One-To-Many
		/*
		Profil p=new Profil("Administrateur");
		
		User u=new User("Aymen","123");
		
		Set<User> users=new HashSet<User>();
		users.add(u);
		p.setSu(users);
		
		dao.insert(p);
		*/
		
		//**** Association Many-To-Many
		/*
		Profil p2=new Profil("Moderateur");
		Set<Fonctionnalite> fct=new HashSet<Fonctionnalite>();
		
		Fonctionnalite f=new Fonctionnalite("Fonction 1");
		Fonctionnalite f2=new Fonctionnalite("Fonction 2");
		
		fct.add(f);
		fct.add(f2);
		
		p2.setFcts(fct);
		
		dao.insert(p2);
		*/
		
		/* Many-To-Many from Profil 
		Profil p=new Profil("Administrateur");
		
		Set<Fonctionnalite> fcts=new HashSet<>();
		Fonctionnalite f1=new Fonctionnalite("Fonctionnalite - 1");
		Fonctionnalite f2=new Fonctionnalite("Fonctionnalite - 2");
		Fonctionnalite f3=new Fonctionnalite("Fonctionnalite - 3");
		
		fcts.add(f1);
		fcts.add(f2);
		fcts.add(f3);
		
		p.setFcts(fcts);
		
		dao.insert(p);
		*/
		
		/*
		Fonctionnalite f1=new Fonctionnalite("Fonctionnalite - 4");
		
		Set<Profil> profils=new HashSet<>();
		
		profils.add(new Profil("Simple utilisateur"));
		profils.add(new Profil("Simple modérateur"));
		profils.add(new Profil("Administrateur"));
		
		f1.setProfils(profils);
		
		dao.insert(f1);
		*/
	}

}
