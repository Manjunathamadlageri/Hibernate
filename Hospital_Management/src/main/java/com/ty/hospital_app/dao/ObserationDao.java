package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Obseration;

public interface ObserationDao 
{
	public Obseration savaObseration(int eid,Obseration obserations);

	public Obseration getObserationId(int oid);

	public boolean deleteObserationId(int oid);

	public Obseration updateObseration(int oid,Obseration obserations);
	
	public List<Obseration> getAllObseration();
	
	public List<Obseration> getObserationByDocterName(String name);
}
