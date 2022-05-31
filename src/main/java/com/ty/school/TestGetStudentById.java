package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetStudentById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student student = entityManager.find(Student.class, 1);

		if(student != null) {
		System.out.println("-------------------------------");
		System.out.println("ID is " + student.getId());
		System.out.println("NAME is " + student.getName());
		System.out.println("PERCENTAGE is " + student.getPercentage());
		}else {
			System.out.println("No Student exsits for guven ID");
		}

	}

}
