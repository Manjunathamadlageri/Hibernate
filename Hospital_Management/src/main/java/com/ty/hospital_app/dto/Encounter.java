package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String reson;
	private String dateofjoin;
	private long dateofdischarge;
	@OneToMany
	private List<Obseration>obserations;
	@ManyToOne
	Person persons;
	@ManyToOne
	Branch branches;
	@OneToMany
	List<MedicineOrder>medicineOrder;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getReson() {
		return reson;
	}
	public void setReson(String reson) {
		this.reson = reson;
	}
	public String getDateofjoin() {
		return dateofjoin;
	}
	public void setDateofjoin(String dateofjoin) {
		this.dateofjoin = dateofjoin;
	}
	public long getDateofdischarge() {
		return dateofdischarge;
	}
	public void setDateofdischarge(long dateofdischarge) {
		this.dateofdischarge = dateofdischarge;
	}
	public List<Obseration> getObserations() {
		return obserations;
	}
	public void setObserations(List<Obseration> obserations) {
		this.obserations = obserations;
	}
	public Person getPersons() {
		return persons;
	}
	public void setPersons(Person persons) {
		this.persons = persons;
	}
	public Branch getBranches() {
		return branches;
	}
	public void setBranches(Branch branches) {
		this.branches = branches;
	}
	public List<MedicineOrder> getMedicineOrder() {
		return medicineOrder;
	}
	public void setMedicineOrder(List<MedicineOrder> medicineOrder) {
		this.medicineOrder = medicineOrder;
	}

}
