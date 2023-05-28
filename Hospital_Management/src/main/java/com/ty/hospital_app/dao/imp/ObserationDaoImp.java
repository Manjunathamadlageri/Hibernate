package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.ObserationDao;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.Obseration;

public class ObserationDaoImp implements ObserationDao
{

	public Obseration savaObseration(int eid, Obseration obserations) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Obseration obserations1 = entityManager.find(Obseration.class, eid);
		if(obserations != null)
		{
			entityTransaction.begin();
			entityManager.persist(obserations1);
			entityTransaction.commit();
			return obserations;
		}
		else
		{
			return null;
		}
	}

	public Obseration getObserationId(int oid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Obseration Obseration=entityManager.find(Obseration.class, oid);
		return Obseration;
	}

	public boolean deleteObserationId(int oid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Obseration Obseration=entityManager.find(Obseration.class, oid);
		if(Obseration != null)
		{
			entityTransaction.begin();
			entityManager.remove(Obseration);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Obseration updateObseration(int oid, Obseration obserations) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Obseration Obseration = entityManager.find(Obseration.class, oid);
		if(Obseration != null)
		{
			Obseration.setEncounter(Obseration.getEncounter());
			Obseration.setNoofObseration(Obseration.getNoofObseration());
			entityTransaction.begin();
			entityManager.merge(Obseration);
			entityTransaction.commit();
			return Obseration;
		}
		else
		{
			return null;
		}
	}

	public List<Obseration> getAllObseration() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Branch S");
		List<Obseration> Obseration = query.getResultList();					
		return Obseration;
	}

	public List<Obseration> getObserationByDocterName(String name) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Branch S");
		List<Obseration> Obseration = query.getResultList();					
		return Obseration;
	}

}
