package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.MedicineOrder;

public interface MedicineOrderDao 
{
	public MedicineOrder savaMedicineOrder(int eid,MedicineOrder mid);

	public MedicineOrder getMedicineOrderId(int mid);

	public boolean deleteMedicineOrder(int mid);

	public MedicineOrder updateMedicineOrderId(int mid);
	
	public List<MedicineOrder> getAllMedicineOrder();
	
	public List<MedicineOrder> getMedicineOrderByDoctorNmae(String name);
	
	public List<MedicineOrder> getMedicineOrderByDate(String date);
	
}
