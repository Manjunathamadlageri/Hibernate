package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.MedicineOrderDao;
import com.ty.hospital_app.dto.MedicineOrder;

public class MedicineOrderDaoImp implements MedicineOrderDao
{

	public MedicineOrder savaMedicineOrder(int eid, MedicineOrder mid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		MedicineOrder mid1 = entityManager.find(MedicineOrder.class, eid);
		if(mid != null)
		{
			entityTransaction.begin();
			entityManager.persist(mid1);
			entityTransaction.commit();
			return mid;
		}
		else
		{
			return null;
		}
	}

	public MedicineOrder getMedicineOrderId(int mid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		MedicineOrder mid1=entityManager.find(MedicineOrder.class, mid);
		return mid1;
	}

	public boolean deleteMedicineOrder(int mid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MedicineOrder mid1=entityManager.find(MedicineOrder.class, mid);
		if(mid1 != null)
		{
			entityTransaction.begin();
			entityManager.remove(mid1);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public MedicineOrder updateMedicineOrderId(int mid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		MedicineOrder mid1 = entityManager.find(MedicineOrder.class, mid);
		if(mid1 != null)
		{
			mid1.setEncounter(mid1.getEncounter());
			mid1.setOrderofdate(mid1.getOrderofdate());
			entityTransaction.begin();
			entityManager.merge(mid1);
			entityTransaction.commit();
			return mid1;
		}
		else
		{
			return null;
		}
	}

	public List<MedicineOrder> getAllMedicineOrder() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Branch S");
		List<MedicineOrder> mid = query.getResultList();					
		return mid;
	}

	public List<MedicineOrder> getMedicineOrderByDoctorNmae(String name) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Branch S");
		List<MedicineOrder> mid = query.getResultList();					
		return mid;
	}

	public List<MedicineOrder> getMedicineOrderByDate(String date) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Branch S");
		List<MedicineOrder> mid = query.getResultList();					
		return mid;
	}

}
