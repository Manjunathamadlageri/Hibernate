package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Item;

public interface ItemDao 
{
	public Item savaItem(int mid,Item items);

	public Item getItemId(int iid);

	public boolean deleteItemId(int iid);

	public Item updateItem(int iid,Item items);
	
	public List<Item> getAllItem();
}
