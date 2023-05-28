package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.MedicineOrderDaoImp;
import com.ty.hospital_app.dto.MedicineOrder;

public class MedicineOrderService 
{
	public void savaMedicineOrder(int eid, MedicineOrder mid)
	{
		MedicineOrderDaoImp  medicineOrderDaoImpDaoImp = new MedicineOrderDaoImp ();
		MedicineOrder medicineOrder = medicineOrderDaoImpDaoImp.savaMedicineOrder(eid, mid);
			if(medicineOrder != null)
			{
				System.out.println("Items Saved");
			}
			else
			{
				System.out.println("Unfortunatly Items not saved");
			}
	}
	public MedicineOrder getMedicineOrderId(int mid)
	{
		MedicineOrderDaoImp  medicineOrderDaoImpDaoImp = new MedicineOrderDaoImp ();
		MedicineOrder medicineOrder = medicineOrderDaoImpDaoImp.getMedicineOrderId(mid);
		if(medicineOrder != null)
		{
			return medicineOrder;
		}
		else
		{
			return null;
		}
	}
	public void deleteMedicineOrder(int mid)
	{
		MedicineOrderDaoImp  medicineOrderDaoImpDaoImp = new MedicineOrderDaoImp();
		boolean flag =medicineOrderDaoImpDaoImp.deleteMedicineOrder(mid);
		if(flag )
		{
			System.out.println("Data deleted");
		}
		else
		{
			System.out.println("Data not deleted");
		}
	}
	public MedicineOrder updateMedicineOrderId(int mid)
	{
		MedicineOrderDaoImp  medicineOrderDaoImpDaoImp = new MedicineOrderDaoImp ();
		MedicineOrder medicineOrder = medicineOrderDaoImpDaoImp.getMedicineOrderId(mid);
		if(medicineOrder != null)
		{
			return medicineOrder;
		}
		else
		{
			return null;
		}
	}
	public List<MedicineOrder> getAllMedicineOrder() 
	{
		MedicineOrderDaoImp  medicineOrderDaoImpDaoImp = new MedicineOrderDaoImp ();
		List<MedicineOrder> medicineOrder = medicineOrderDaoImpDaoImp.getAllMedicineOrder();
		if(medicineOrder != null)
		{
			return medicineOrder;
		}
		else
		{
			return null;
		}
	}
}


























