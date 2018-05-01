package dao.daoGen;


import metier.entities.Profil;

public class TestGen {

	public static void main(String[] args) {
		
		IDaoGen<Profil> dao=new DaoGenImpl<>();
		
		Profil p=new Profil("samaedi 24","Description");
		
		dao.insert(p);

	}

}
