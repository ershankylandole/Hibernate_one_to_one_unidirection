package com.clc.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {

		Address address = new Address(1, "pune");
		Employee emp = new Employee(1, "shashank", address);

		SessionFactory factory = new Configuration().configure("/hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Address.class).buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		session.save(emp);

		session.flush();
		tr.commit();

	}

}
