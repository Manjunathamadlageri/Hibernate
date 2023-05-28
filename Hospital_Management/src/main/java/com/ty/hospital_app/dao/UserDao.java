package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.User;

public interface UserDao 
{
	public User savaPerson(User users);
	
	public User getHospitalId(int uid);


	public boolean deleteHospitalId(int uid);


	public User updateHospital(int uid,User users);
	
	public List<User> getAllUser();
	
	public List<User> getUserRoles(String role);
	
}
