package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import metier.entities.Profil;
import metier.entities.User;

public class DaoUserImpl implements IDao<User> {
	
	private SessionFactory sf = SessionFactoryUtil.getInstance().getSf();
	
	@Override
	public boolean insert(User u) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(u);
			tx.commit();
			return true;
			
		}catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return false;
		}
	}

	@Override
	public boolean update(User u) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		try {
			session.merge(u);
			tx.commit();
			return true;
			
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return false;
			
		}
		
	}

	@Override
	public boolean delete(Long id) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		try {
			User u=(User)session.get(User.class, id);
			u.setProfil(null);
			session.delete(u);
			tx.commit();
			return true;
			
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return false;
			
		}
		
	}

	@Override
	public List<User> select(User o) {
		Session session=sf.openSession();
		return session.createQuery("select u from User u").list();
	}

	@Override
	public User getElement(Long id) {
		Session session=sf.openSession();
		
		User u=(User)session.get(User.class, id);
		return u;
	}

	@Override
	public List<User> getElementBy(String ch) {
		Session session=sf.openSession();
		Query req=session.createQuery("select u from User u where u.login like:x");
		req.setString("x", "%"+ch+"%");
		return req.list();
	}

	@Override
	public List<User> selectAll() {
		Session session=sf.openSession();
		return session.createQuery("select u from User u").list();
	}

}
