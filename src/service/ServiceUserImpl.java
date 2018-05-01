package service;

import java.util.List;

import dao.DaoUserImpl;
import dao.IDao;
import metier.entities.User;

public class ServiceUserImpl implements IService<User> {
	
	private IDao<User> dao=new DaoUserImpl();
	
	@Override
	public boolean ajouter(User u) {
		return dao.insert(u);
	}

	@Override
	public boolean modifier(User u) {
		return dao.update(u);
	}

	@Override
	public boolean supprimer(Long id) {
		return dao.delete(id);
	}

	@Override
	public User getElement(Long id) {
		return dao.getElement(id);
	}

	@Override
	public List<User> getElementBy(String ch) {
		return dao.getElementBy(ch);
	}

	@Override
	public List<User> lister(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> listAll() {
		return dao.selectAll();
	}

}
