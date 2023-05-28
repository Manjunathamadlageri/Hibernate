package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.BranchDaoImp;
import com.ty.hospital_app.dto.Branch;



public class BranchService {
	public void savaHospital(int hid,Branch branch)
	{
		BranchDaoImp  branchDaoImp = new BranchDaoImp ();
		Branch branch1 = branchDaoImp.savaBranch(hid, branch);
		if(branch1 != null)
		{
			System.out.println("Branch Saved");
		}
		else
		{
			System.out.println("Unfortunatly Branch not saved");
		}
	}
	
	
	public Branch getHospitalById(int hid)
	{
		BranchDaoImp  branchDaoImp = new BranchDaoImp();
		Branch branch1 = branchDaoImp.getBranchId(hid);
		if(branch1 != null)
		{
			return branch1;
		}
		else
		{
			return null;
		}
	}
	public void deleteHospitalById(int hid)
	{
		BranchDaoImp  branchDaoImp = new BranchDaoImp();
		boolean flag =branchDaoImp.deleteBranchId(hid);
		if(flag )
		{
			System.out.println("Branch deleted");
		}
		else
		{
			System.out.println("Branch not deleted");
		}
	}
	public Branch updataHospitalById(int hd,Branch hospital)
	{
		BranchDaoImp  branchDaoImp = new BranchDaoImp();
		Branch branch1 = branchDaoImp.updateBranch(hd, hospital);
		if(branch1 != null)
		{
			return branch1;
		}
		else
		{
			return null;
		}
	}
}
