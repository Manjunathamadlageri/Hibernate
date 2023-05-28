package com.ty.hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Obseration 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Oid;
	private String dname;
	private String noofObseration;
	@ManyToOne
	private Encounter encounter;
	public int getOid() {
		return Oid;
	}
	public void setOid(int oid) {
		Oid = oid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getNoofObseration() {
		return noofObseration;
	}
	public void setNoofObseration(String noofObseration) {
		this.noofObseration = noofObseration;
	}
	public Encounter getEncounter() {
		return encounter;
	}
	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

}
