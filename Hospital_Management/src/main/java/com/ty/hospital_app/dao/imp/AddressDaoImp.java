package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.AddressDao;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;

public class AddressDaoImp implements AddressDao
{

	public Address savaAddress(int mid, Address address) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Address address1 = entityManager.find(Address.class, mid);
		if(address != null)
		{
			entityTransaction.begin();
			entityManager.persist(address1);
			entityTransaction.commit();
			return address;
		}
		else
		{
			return null;
		}
	}

	public Address getAddressId(int aid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Address address=entityManager.find(Address.class, aid);
		return address;
	}

	public Address updateAddress(int aid, Address address) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Address address1 = entityManager.find(Address.class, aid);
		if(address != null)
		{
			address.setBranch(address.getBranch());
			address.setState(address.getState());
			entityTransaction.begin();
			entityManager.merge(address1);
			entityTransaction.commit();
			return address;
		}
		else
		{
			return null;
		}
	}
	public boolean deleteAddress(int aid)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Address address=entityManager.find(Address.class, aid);
		if(address != null)
		{
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public List<Address> getAddressAll() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Branch S");
		List<Address> address = query.getResultList();					
		return address;
	}

	
}
