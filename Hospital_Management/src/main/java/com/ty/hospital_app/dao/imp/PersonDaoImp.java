package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.PersonDao;
import com.ty.hospital_app.dto.Person;

public class PersonDaoImp implements PersonDao
{

	public Person savaPerson(int eid, Person persons) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person = entityManager.find(Person.class, eid);
		if(persons != null)
		{
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			return persons;
		}
		else
		{
			return null;
		}
		}

	public Person getPersonId(int pid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person persons=entityManager.find(Person.class, pid);
		return persons;
	}

	public boolean deletePersonId(int pid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person persons=entityManager.find(Person.class, pid);
		if(persons != null)
		{
			entityTransaction.begin();
			entityManager.remove(persons);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Person updatePerson(int pid, Person persons) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person persons1 = entityManager.find(Person.class, pid);
		if(persons != null)
		{
			persons1.setAge(persons.getAge());
			persons1.setPaddress(persons.getPaddress());
			entityTransaction.begin();
			entityManager.merge(persons1);
			entityTransaction.commit();
			return persons;
		}
		else
		{
			return null;
		}
	}

	public List<Person> getAllPerson() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Branch S");
		List<Person> persons = query.getResultList();					
		return persons;
	}

	public List<Person> getPersonByAge(int age) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Branch S");
		List<Person> persons = query.getResultList();					
		return persons;
	}

	public List<Person> getPersonByGender(String gernder) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Branch S");
		List<Person> persons = query.getResultList();					
		return persons;
	}

	public List<Person> getPersonByPhono(long phono) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Branch S");
		List<Person> persons = query.getResultList();					
		return persons;
	}

}
