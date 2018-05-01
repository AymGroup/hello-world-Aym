package service;

import java.util.List;

import dao.DaoProfilImpl;
import dao.IDao;
import metier.entities.Profil;

public class ServiceProfilImpl implements IService<Profil> {

	private IDao dao=new DaoProfilImpl();
	
	@Override
	public boolean ajouter(Profil p) {
		boolean rep=dao.insert(p);
		return rep;
	}

	@Override
	public boolean modifier(Profil p) {
		boolean rep=dao.update(p);
		return rep;
	}

	@Override
	public boolean supprimer(Long id) {
		boolean rep=dao.delete(id);
		return rep;
	}

	@Override
	public List<Profil> lister(Profil p) {
		List<Profil> profils=dao.select(p);
		return profils;
	}

	@Override
	public List<Profil> listAll() {
		List<Profil> profils=dao.selectAll();
		return profils;
	}

	@Override
	public Profil getElement(Long id) {
		Profil p=(Profil)dao.getElement(id);
		return p;
	}

	@Override
	public List<Profil> getElementBy(String ch) {
		List<Profil> profils=dao.getElementBy(ch);
		return profils;
	}

	

}
