package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavaStudentCourse {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student = new Student();
		student.setName("Manjunath");
		student.setAge(23);
		student.setMarks(85);
		
		Student student1 = new Student();
		student1.setName("Standly");
		student1.setAge(23);
		student1.setMarks(85);
		
		Student student2 = new Student();
		student2.setName("pavan");
		student2.setAge(23);
		student2.setMarks(85);
		
		Course course = new Course();
		course.setCname("Java");
		course.setDuration("6-Months");
		course.setFees(35000.0);
		course.setTrainer("Kheshav");
		
		Course course1 = new Course();
		course1.setCname("SQL");
		course1.setDuration("2-Months");
		course1.setFees(25000.0);
		course1.setTrainer("Shweth");
		
		Course course2 = new Course();
		course2.setCname("WEB");
		course2.setDuration("2-Months");
		course2.setFees(18000.0);
		course2.setTrainer("Lavanya");
		
		Course course3 = new Course();
		course3.setCname("Project");
		course3.setDuration("2-Months");
		course3.setFees(35000.0);
		course3.setTrainer("Uday");
		
		
		Course course4 = new Course();
		course4.setCname("DS");
		course4.setDuration("2-Months");
		course4.setFees(35000.0);
		course4.setTrainer("Dharshan");
		
		List<Student> list= new ArrayList<Student>();
		list.add(student2);
		list.add(student1);
		list.add(student);
		
		List<Student> list1 = new ArrayList<Student>();
		list1.add(student);
		list1.add(student2);
		list.add(student1);
		
		List<Student> list2= new ArrayList<Student>();
		list2.add(student);
		list2.add(student1);
		list.add(student2);
		
		
		List<Course> list11 = new ArrayList<Course>();
		list11.add(course);
		list11.add(course1);
		list11.add(course2);
		
		List<Course> list12 = new ArrayList<Course>();
		list12.add(course3);
		list12.add(course4);
		list12.add(course);
		
		List<Course> list13 = new ArrayList<Course>(); 
		list13.add(course2);
		list13.add(course3);
		list13.add(course4);
		
		student.setCourses(list11);
		student1.setCourses(list12);
		student2.setCourses(list13);
		
		
		course.setStudents(list);
		course1.setStudents(list1);
		course2.setStudents(list2);
		course3.setStudents(list);
		course4.setStudents(list2);
		
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(student2);
		
		entityManager.persist(course);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityManager.persist(course4);
		
		entityTransaction.commit();
		
	}

}
