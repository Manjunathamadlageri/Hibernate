package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.AddressDaoImp;
import com.ty.hospital_app.dto.Address;

public class AddressService {

	public void savaAddress(int mid, Address address)
	{
		AddressDaoImp  addressDaoImp = new AddressDaoImp ();
		Address address1 = addressDaoImp.savaAddress(mid, address);
		if(address1 != null)
		{
			System.out.println("Address Saved");
		}
		else
		{
			System.out.println("Unfortunatly Address not saved");
		}
	}
	public Address getAddressById(int mid)
	{
		AddressDaoImp  addressDaoImp = new AddressDaoImp ();
		Address address1 = addressDaoImp.getAddressId(mid);
		if(address1 != null)
		{
			return address1;
		}
		else
		{
			return null;
		}
	}

	public Address updateAddress(int aid, Address address)
	{
		AddressDaoImp  addressDaoImp = new AddressDaoImp ();
		Address address1 = addressDaoImp.savaAddress(aid, address);
		if(address1 != null)
		{
			return address1;
		}
		else
		{
			return null;
		}
	}
	public void deleteAddress(int aid)
	{
		AddressDaoImp  addressDaoImp = new AddressDaoImp ();
		boolean address1 = addressDaoImp.deleteAddress(aid);
		if(address1)
		{
			System.out.println("Address Saved");
		}
		else
		{
			System.out.println("Unfortunatly Address not saved");
		}
	}
	public  List<Address> getAddressAll()
	{
		AddressDaoImp  addressDaoImp = new AddressDaoImp ();
		List<Address> address1 = addressDaoImp.getAddressAll();
		if(address1 != null)
		{
			return address1;
		}
		else
		{
			return null;
		}
	}
}
