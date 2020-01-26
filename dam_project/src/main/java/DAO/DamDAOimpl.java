package DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Entity.DamEntity;

public class DamDAOimpl implements DamDAO {
private SessionFactory factory = SingleTon.getFactory();
	public void save(DamEntity entity) {
	Session session = factory.openSession();
	try {
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();
		System.out.println("Data stored successfully");
	}
catch(HibernateException he){
	he.printStackTrace();
}
	}
	
	public DamEntity Retrive(int w_id) {
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			DamEntity entity = session.get(DamEntity.class, w_id);
			session.close();
			factory.close();
			return entity;
			
			
		}
		catch(HibernateException he) {
			he.printStackTrace();
		}
		return null;
	}

	public void UpdateByName(String d_name, int d_id) {
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			DamEntity entity = session.get(DamEntity.class, d_id);
			if(entity!=null) {
				System.out.println("entity found");
				entity.setName(d_name);
				session.update(entity);
			}
		}
			catch(HibernateException he) {
				he.printStackTrace();
			}
	}
	public void DeleteById(int d_id) {
		Session session = factory.openSession();
		try {
			session.beginTransaction();
DamEntity removableEntity = session.load(DamEntity.class, d_id);
			
			if(removableEntity != null) {
				System.out.println("Entity Founded, JVM Is Great Now JVM able to update it.");
				session.delete(removableEntity);
				System.out.println("Hmmm now you are on fly, Give me Triple Party.");
			}else {
				System.out.println("Entity Not Found, Use Diffrent Programming Language.");
			}
			
			session.getTransaction().commit();
			System.out.println("tranzaction commited");
			session.close();
			factory.close();
			System.out.println("Resources closed.");
		} catch (HibernateException he) {
			he.printStackTrace();
		}
	}
}

	