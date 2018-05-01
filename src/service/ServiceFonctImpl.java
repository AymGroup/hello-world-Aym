package service;

import java.util.List;

import dao.DaoFonctImpl;
import dao.DaoProfilImpl;
import dao.IDao;
import metier.entities.Fonctionnalite;

public class ServiceFonctImpl implements IService<Fonctionnalite> {

	private IDao dao=new DaoFonctImpl();
	
	@Override
	public boolean ajouter(Fonctionnalite f) {
		return dao.insert(f);
	}

	@Override
	public boolean modifier(Fonctionnalite f) {
		return dao.update(f);
	}

	@Override
	public boolean supprimer(Long id) {
		return dao.delete(id);
	}

	@Override
	public Fonctionnalite getElement(Long id) {
		return (Fonctionnalite) dao.getElement(id);
	}

	@Override
	public List<Fonctionnalite> getElementBy(String ch) {
		return dao.getElementBy(ch);
	}

	@Override
	public List<Fonctionnalite> lister(Fonctionnalite o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fonctionnalite> listAll() {
		return dao.selectAll();
	}

}
