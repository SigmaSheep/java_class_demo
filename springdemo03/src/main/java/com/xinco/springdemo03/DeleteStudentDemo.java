package com.xinco.springdemo03;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xinco.springdemo03.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		try {
			
			Session session = factory.getCurrentSession();
			
			session.beginTransaction();
			
			int id = 1;
			
			Student student = session.get(Student.class, id);
			System.out.println("Student got: " + student);
			session.delete(student);
			session.createQuery("delete from Student where id=2").executeUpdate();	

			session.getTransaction().commit();

		} finally {
			factory.close();
		}
		
	}

}
