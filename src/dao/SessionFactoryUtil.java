package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	
	private SessionFactory sf;
	private static SessionFactoryUtil instance;
	
	//**** Création du Factory
	private SessionFactoryUtil() {
		Configuration cfg = new Configuration();
		cfg.configure("config/hibernate2.cfg.xml");
		sf = cfg.buildSessionFactory();
	}
	
	public static SessionFactoryUtil getInstance () {
		if (instance == null) {
			instance = new SessionFactoryUtil();
		}
		return instance;
	}
	
	public SessionFactory getSf() {
		if(sf == null)
			new SessionFactoryUtil();
		return sf;
	}

}
