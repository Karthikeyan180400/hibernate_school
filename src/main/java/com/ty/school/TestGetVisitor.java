package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetVisitor {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Visitor visitor = entityManager.find(Visitor.class, 100);

		if (visitor != null) {
			System.out.println("-------------------------");
			System.out.println("ID is " + visitor.getId());
			System.out.println("Name is " + visitor.getName());
			System.out.println("Email is " + visitor.getEmail());
			System.out.println("DOB is " + visitor.getDob());
			System.out.println("VisitDataTime is " + visitor.getVisitDateTime());
			System.out.println("Gender is " + visitor.getGender());

		} else {
			System.out.println("No visitor found for given Id");
		}

	}

}
