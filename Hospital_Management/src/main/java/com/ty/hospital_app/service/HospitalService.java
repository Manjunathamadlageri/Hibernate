package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.HospitalDaoImp;
import com.ty.hospital_app.dto.Hospital;

public class HospitalService 
{
	public void savaHospital(Hospital hospital)
	{
		HospitalDaoImp  daoImp = new HospitalDaoImp();
		Hospital hospital1 = daoImp.savaHospital(hospital);
		if(hospital1 != null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunatly data not saved");
		}
	}
	public Hospital getHospitalById(int hid)
	{
		HospitalDaoImp  daoImp = new HospitalDaoImp();
		Hospital hospital1 = daoImp.getHospitalId(hid);
		if(hospital1 != null)
		{
			return hospital1;
		}
		else
		{
			return null;
		}
	}
	public void deleteHospitalById(int hid)
	{
		HospitalDaoImp  daoImp = new HospitalDaoImp();
		boolean flag =daoImp.deleteHospitalId(hid);
		if(flag )
		{
			System.out.println("Data deleted");
		}
		else
		{
			System.out.println(" data not deleted");
		}
	}
	public Hospital updataHospitalById(int hd,Hospital hospital)
	{
		HospitalDaoImp  daoImp = new HospitalDaoImp();
		Hospital hospital1 = daoImp.updateHospital(hd, hospital);
		if(hospital1 != null)
		{
			return hospital1;
		}
		else
		{
			return null;
		}
	}
}




























