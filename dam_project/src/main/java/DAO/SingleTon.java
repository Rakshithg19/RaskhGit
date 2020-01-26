package DAO;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entity.DamEntity;

public class SingleTon {
	private static  SessionFactory factory;
	public static  SessionFactory getFactory() {
	return factory;
}
	static {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(DamEntity.class);
		factory = con.buildSessionFactory();
	}

}