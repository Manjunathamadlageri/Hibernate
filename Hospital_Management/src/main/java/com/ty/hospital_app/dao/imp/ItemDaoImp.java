package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.ItemDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Item;

public class ItemDaoImp implements  ItemDao
{

	public Item savaItem(int mid, Item items) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Item item1 = entityManager.find(Item.class, mid);
		if(items != null)
		{
			entityTransaction.begin();
			entityManager.persist(item1);
			entityTransaction.commit();
			return items;
		}
		else
		{
			return null;
		}
	}

	public Item getItemId(int iid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Item items=entityManager.find(Item.class, iid);
		return items;
	}

	public boolean deleteItemId(int iid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item items=entityManager.find(Item.class, iid);
		if(items != null)
		{
			entityTransaction.begin();
			entityManager.remove(items);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Item updateItem(int iid, Item items) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Item items1 = entityManager.find(Item.class, iid);
		if(items != null)
		{
			items.setCost(items.getCost());
			items.setmOrders(items.getmOrders());
			entityTransaction.begin();
			entityManager.merge(items1);
			entityTransaction.commit();
			return items;
		}
		else
		{
			return null;
		}
	}

	public List<Item> getAllItem() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Branch S");
		List<Item> items = query.getResultList();					
		return items;
	}

}
