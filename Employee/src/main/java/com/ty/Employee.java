package com.ty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Employee 
{
	@Id
	private int id;
	private String name;
	private int age;
	private long phono;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhono() {
		return phono;
	}
	public void setPhono(long phono) {
		this.phono = phono;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
