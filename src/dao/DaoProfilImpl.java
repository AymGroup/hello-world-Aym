package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import metier.entities.Profil;

public class DaoProfilImpl implements IDao<Profil> {
	
	private SessionFactory sf=SessionFactoryUtil.getInstance().getSf();
	
	@Override
	public boolean insert(Profil p) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		try {
			session.save(p);
			tx.commit();
			return true;
			
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return false;
		}
	}

	@Override
	public boolean update(Profil p) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		try {
			
			//Profil profil=(Profil)session.get(Profil.class,p.getId().longValue());
			session.merge(p);
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
		SessionFactory sf=SessionFactoryUtil.getInstance().getSf();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		try {
			Profil p=(Profil)session.get(Profil.class,id);
			session.delete(p);
			tx.commit();
			return true;
			
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return false;
		}
		
	}

	@Override
	public List<Profil> select(Profil o) {
		return null;
	}

	@Override
	public List<Profil> selectAll() {
		Session session=sf.openSession();
		
		return session.createQuery("select p from Profil p").list(); 
	}

	@Override
	public Profil getElement(Long id) {
		Session session=sf.openSession();
		
		Profil p=(Profil)session.get(Profil.class, id);
		return p;
		
	}

	@Override
	public List<Profil> getElementBy(String ch) {
		Session session=sf.openSession();
		Query req=session.createQuery("select p from Profil p where p.libelle like:x");
		req.setString("x", "%"+ch+"%");
		return req.list();
	}

}
