package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveEmployee 
{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee= new Employee();
		employee.setId(201);
		employee.setName("manju");
		employee.setAge(23);
		employee.setPhono(8217451604l);
		employee.setSalary(25000.0);
		Employee employee1= new Employee();
		employee1.setId(202);
		employee1.setName("standly");
		employee1.setAge(23);
		employee1.setPhono(8217451604l);
		employee1.setSalary(35000.0);
		Employee employee2= new Employee();
		employee2.setId(203);
		employee2.setName("danusha");
		employee2.setAge(23);
		employee2.setPhono(8217451604l);
		employee2.setSalary(35000.0);
		Employee employee3= new Employee();
		employee3.setId(204);
		employee3.setName("pavan");
		employee3.setAge(23);
		employee3.setPhono(8217451604l);
		employee3.setSalary(35000.0);
		entityTransaction.begin();
		entityManager.persist(employee);
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityManager.persist(employee3);
		entityTransaction.commit();
	}
}
