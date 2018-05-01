package dao.daoGen;

import java.util.List;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.SessionFactoryUtil;

public class DaoGenImpl<T> implements IDaoGen<T> {
	
	private SessionFactory sf=SessionFactoryUtil.getInstance().getSf();
	
	@Override
	public boolean insert(T t) {
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		try {
			session.save(t);
			tx.commit();
			return true;
		}catch(Exception e) {
			e.getMessage();
			return false;
		}
		
	}

	@Override
	public boolean update(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<T> select(T t) {
		Class<T> clazz=(Class<T>) t.getClass();
		Field[] attributs=clazz.getDeclaredFields();
		
		String hql = "from " + clazz.getSimpleName() + " where 1=1 ";
		
		for(Field f:attributs) {
			String first = "" + f.getName().charAt(0); //recupère la première lettre de l'attribut
			String nameGetter = "get" + f.getName().replaceFirst(first, first.toUpperCase());
			
			
			try {
				Method m = clazz.getDeclaredMethod(nameGetter);
				Object valeur = m.invoke(t, null);
				System.out.println(f.getName() + ": " + valeur);

				if (valeur != null && !"".equals(valeur)) {

					hql += " AND " + f.getName() + "='" + valeur + "'";
				}
			}catch(Exception e) {
				e.getMessage();
			}
		}
	}

}
