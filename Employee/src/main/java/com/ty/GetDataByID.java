package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class GetDataByID 
{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		Query query=entityManager.createQuery("select e from Employee e");
		List<Employee> employee=query.getResultList();
		for(Employee emp : employee)
		{
			System.out.println("The Employee Id is" +emp.getId());
			System.out.println("The Employee name is" +emp.getName());
			System.out.println("The Employee age is" +emp.getAge());
			System.out.println("The Employee salary is" +emp.getSalary());
			
		}
		
//		Employee employee=entityManager.find(Employee.class, 103);
//		System.out.println(employee.getId());
//		System.out.println(employee.getName());
//		System.out.println(employee.getAge());
//		System.out.println(employee.getPhono());
//		System.out.println(employee.getSalary());
		
	}
}
