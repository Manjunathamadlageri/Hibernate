package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.BranchDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;

public class BranchDaoImp  implements BranchDao
{

	public Branch savaBranch(int hid, Branch branch) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Branch branch1 = entityManager.find(Branch.class, hid);
		if(branch != null)
		{
			entityTransaction.begin();
			entityManager.persist(branch1);
			entityTransaction.commit();
			return branch;
		}
		else
		{
			return null;
		}
		
	}

	public Branch getBranchId(int bid) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Branch branch=entityManager.find(Branch.class, bid);
		return branch;
	}

	public boolean deleteBranchId(int bid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch=entityManager.find(Branch.class, bid);
		if(branch != null)
		{
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Branch updateBranch(int bid, Branch branch) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Branch branch1 = entityManager.find(Branch.class, bid);
		if(branch != null)
		{
			branch.setBname(branch.getBname());
			branch.setAddress(branch.getAddress());
			entityTransaction.begin();
			entityManager.merge(branch1);
			entityTransaction.commit();
			return branch;
		}
		else
		{
			return null;
		}
	}

	public List<Branch> getBranchAll() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select s from Branch S");
		List<Branch> branch = query.getResultList();					
		return branch;
	}

}
