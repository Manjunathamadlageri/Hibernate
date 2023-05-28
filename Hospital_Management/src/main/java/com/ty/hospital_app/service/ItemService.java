package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.ItemDaoImp;
import com.ty.hospital_app.dto.Item;

public class ItemService 
{
   public void savaItem(int mid, Item items)
   {
	   ItemDaoImp  itemsDaoImp = new ItemDaoImp ();
	   Item items1 = itemsDaoImp.savaItem(mid, items);
		if(items1 != null)
		{
			System.out.println("Items Saved");
		}
		else
		{
			System.out.println("Unfortunatly Items not saved");
		}
   }
   public Item getItemId(int iid)
   {
	   ItemDaoImp  itemsDaoImp = new ItemDaoImp ();
	   Item items1 = itemsDaoImp.getItemId(iid);
		if(items1 != null)
		{
			return items1;
		}
		else
		{
			return null;
		}
   }
   public void deleteItemId(int iid)
   {
	   ItemDaoImp  itemsDaoImp = new ItemDaoImp ();
	   boolean items1 = itemsDaoImp.deleteItemId(iid);
		if(items1 )
		{
			System.out.println("Data deleted");
		}
		else
		{
			System.out.println(" data not deleted");
		}
   }
   public Item updateItem(int iid, Item items)
   {
	   ItemDaoImp  itemsDaoImp = new ItemDaoImp ();
	   Item items1 = itemsDaoImp.getItemId(iid);
		if(items1 != null)
		{
			return items1;
		}
		else
		{
			return null;
		}
   }
   public List<Item> getAllItem()
   {
	   ItemDaoImp  itemsDaoImp = new ItemDaoImp ();
		List<Item> items1 = itemsDaoImp.getAllItem();
		if(items1 != null)
		{
			return items1;
		}
		else
		{
			return null;
		}
   }
}
