package com.xinco.springdemo03;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xinco.springdemo03.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		try {
			
			Session session = factory.getCurrentSession();
			
			session.beginTransaction();
			
			int id = 3;
			
			Student student = session.get(Student.class, id);
			student.setEmail("xxx@xxx.com");
			
			session.createQuery("update Student set lastName='AA'").executeUpdate();
			
			session.getTransaction().commit();
									
		} finally {
			factory.close();
		}
		
	}

}
