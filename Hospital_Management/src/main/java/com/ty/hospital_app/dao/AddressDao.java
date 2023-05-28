package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Address;


public interface AddressDao 
{
	public Address savaAddress(int mid,Address address);

	public Address getAddressId(int aid);


	public Address updateAddress(int aid,Address address);
	
	public List<Address> getAddressAll();

}
