package com.xinco.springdemo03;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xinco.springdemo03.entity.Student;

public class ListStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		try {
			
			Session session = factory.getCurrentSession();
			
			session.beginTransaction();
			
			List<Student> students = session.createQuery("from Student").list();
			
			for (Student student : students) {
				System.out.println(student);
			}
						
			// read not need commit
			//session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
		
	}

}
