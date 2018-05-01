package dao.test;

import java.util.List;

import dao.DaoProfilImpl;
import dao.DaoUserImpl;
import dao.IDao;
import metier.entities.Fonctionnalite;
import metier.entities.Profil;
import metier.entities.User;

public class TestDao_2 {

	public static void main(String[] args) {
		
		//**** Many-To-One
		IDao<User> dao=new DaoUserImpl();
		
		//Profil p1=new Profil("Administrateur");
		/*User u1=new User("Aymen","Mankari");
		u1.setProfil(p1);
		dao.insert(u1);*/
		
		
		IDao<Profil> daoProfil=new DaoProfilImpl();
		/*
		p1.setFonction(new Fonctionnalite("Fonctionnalite - 1"));
		
		daoProfil.insert(p1);
		*/
		/*
		Profil p=new Profil(8L,"wwwww","wwwww");
		
		daoProfil.update(p);
		*/
		
		List<Profil> profils=daoProfil.getElementBy("H");
		
		for(Profil p:profils) {
			System.out.println(p.getLibelle());
		}
		
	}

}
