package com.ty.hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iid;
	private String name;
	private double cost;
	private int qantity;
	@ManyToOne
	private MedicineOrder  mOrders;
	public int getId() {
		return iid;
	}
	public void setId(int id) {
		this.iid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getQantity() {
		return qantity;
	}
	public void setQantity(int qantity) {
		this.qantity = qantity;
	}
	public MedicineOrder getmOrders() {
		return mOrders;
	}
	public void setmOrders(MedicineOrder mOrders) {
		this.mOrders = mOrders;
	} 

}
