package com.ty.school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVisitor {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Visitor visitor = new Visitor();
		visitor.setId(102);
		visitor.setName("Karthi");
		visitor.setEmail("karthi@mail.com");
		visitor.setDob(LocalDate.of(2000, 04, 18));
		visitor.setVisitDateTime(LocalDateTime.now());
		visitor.setGender("Male");

		entityTransaction.begin();
		entityManager.persist(visitor);
		entityTransaction.commit();

		System.out.println("............Doneehh........");

	}

}
