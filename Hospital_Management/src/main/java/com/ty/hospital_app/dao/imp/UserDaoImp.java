package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.UserDao;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.dto.User;

public class UserDaoImp implements UserDao
{

	public User savaPerson(User users) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(users);
		entityTransaction.commit();
		return users;
	}

	public User getHospitalId(int uid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		User users=entityManager.find(User.class, uid);
		return users;
	}

	public boolean deleteHospitalId(int uid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		User users=entityManager.find(User.class, uid);
		if(users != null)
		{
			entityTransaction.begin();
			entityManager.remove(users);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public User updateHospital(int uid, User users) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User users1 = entityManager.find(User.class, uid);
		if(users != null)
		{
			users1.setPassword(users1.getPassword());
			users1.setRole(users1.getRole());
			entityTransaction.begin();
			entityManager.merge(users1);
			entityTransaction.commit();
			return users;
		}
		else
		{
			return null;
		}
	}

	public List<User> getAllUser() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Branch S");
		List<User> users = query.getResultList();					
		return users;
	}

	public List<User> getUserRoles(String role) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Branch S");
		List<User> users = query.getResultList();					
		return users;
	}

}
