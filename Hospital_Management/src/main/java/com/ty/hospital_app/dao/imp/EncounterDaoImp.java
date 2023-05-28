package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.EncounterDao;
import com.ty.hospital_app.dto.Encounter;


public class EncounterDaoImp implements EncounterDao
{

	public Encounter savaEncounter(int bid, Encounter encounter) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Encounter encounter1 = entityManager.find(Encounter.class, bid);
		if(encounter != null)
		{
			entityTransaction.begin();
			entityManager.persist(encounter1);
			entityTransaction.commit();
			return encounter;
		}
		else
		{
			return null;
		}
	}

	public Encounter getEncounter(int eid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		return encounter;
	}

	public boolean deleteEncounter(int eid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if(encounter != null)
		{
			entityTransaction.begin();
			entityManager.remove(encounter);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Encounter updateEncounterId(int bid, Encounter encounter) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter1=entityManager.find(Encounter.class, bid);
		if(encounter != null)
		{
			encounter.setBranches(encounter.getBranches());
			encounter.setDateofjoin(encounter.getDateofjoin());
			entityTransaction.begin();
			entityManager.merge(encounter1);
			entityTransaction.commit();
			return encounter;
		}
		else
		{
			return null;
		}
	}

	public List<Encounter> getAllEncounter() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Branch S");
		List<Encounter> encounter = query.getResultList();					
		return encounter;
	}

}
