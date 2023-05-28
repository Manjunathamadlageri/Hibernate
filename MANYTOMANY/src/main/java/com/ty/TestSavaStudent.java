package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavaStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Student student = new Student();
		student.setName("Manjunath");
		student.setAge(23);
		student.setMarks(65.0);
		
		Student student1 = new Student();
		student1.setName("Dhanush");
		student1.setAge(23);
		student1.setMarks(78.0);
		
		
		Course course= new Course();
		course.setName("Java");
		course.setDuration("6 months");
		course.setFees(35000.0);
		course.setTrainer("Faizen");
		
		Course course2= new Course();
		course2.setName("Java Projects");
		course2.setDuration("2 months");
		course2.setFees(25000.0);
		course2.setTrainer("Uday");
		
		Course course3= new Course();
		course3.setName("SQL");
		course3.setDuration("3 months");
		course3.setFees(45000.0);
		course3.setTrainer("Swetha");
		
		Course course4= new Course();
		course4.setName("WEB");
		course4.setDuration("2 months");
		course4.setFees(25000.0);
		course4.setTrainer("Lavanya");
		
		Course course5= new Course();
		course5.setName("Java Advance");
		course5.setDuration("3 months");
		course5.setFees(45000.0);
		course5.setTrainer("Keshav");
		
		List<Course> list = new ArrayList<Course>();
		list.add(course);
		list.add(course2);
		list.add(course3);
		
		List<Course> list1 = new ArrayList<Course>();
		list1.add(course2);
		list1.add(course3);
		list1.add(course4);
		
		List<Course> list2 = new ArrayList<Course>();
		list2.add(course3);
		list2.add(course4);
		list2.add(course5);
		
		student.setCourses(list);
		student.setCourses(list1);
		student1.setCourses(list1);
		student1.setCourses(list2);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(course);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityManager.persist(course4);
		entityManager.persist(course5);
		entityTransaction.commit();
	}
}
