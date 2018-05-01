package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import metier.entities.Fonctionnalite;

public class DaoFonctImpl implements IDao<Fonctionnalite> {

	private SessionFactory sf = SessionFactoryUtil.getInstance().getSf();
	
	@Override
	public boolean insert(Fonctionnalite f) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(f);
			tx.commit();
			return true;
			
		}catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return false;
		}
	}

	@Override
	public boolean update(Fonctionnalite f) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		try {
			session.merge(f);
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
		
		try{
			Fonctionnalite f=(Fonctionnalite) session.get(Fonctionnalite.class, id);
			f.setProfils(null);
			session.delete(f);
			tx.commit();
			return true;
			
		}catch(HibernateException e){
			e.printStackTrace();
			tx.rollback();
			return false;
		}
	}

	@Override
	public Fonctionnalite getElement(Long id) {
		Session session=sf.openSession();
		Fonctionnalite f=(Fonctionnalite) session.get(Fonctionnalite.class, id);
		
		return f;
	}

	@Override
	public List<Fonctionnalite> getElementBy(String ch) {
		Session session=sf.openSession();
		Query req= session.createQuery("select f from Fonctionnalite f where f.libelle like :x");
		req.setString("x", "%"+ch+"%");
		return req.list();
	}

	@Override
	public List<Fonctionnalite> select(Fonctionnalite o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fonctionnalite> selectAll() {
		Session session=sf.openSession();
		return session.createQuery("select f from Fonctionnalite f").list();
	}

}
