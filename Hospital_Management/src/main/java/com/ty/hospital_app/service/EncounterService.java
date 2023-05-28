package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.EncounterDaoImp;
import com.ty.hospital_app.dto.Encounter;

public class EncounterService {
	
	public void savaEncounter(int bid,Encounter encounter)
	{
		EncounterDaoImp  encounterDaoImp = new EncounterDaoImp ();
		Encounter encounter1 = encounterDaoImp.savaEncounter(bid, encounter);
		if(encounter1 != null)
		{
			System.out.println("Encounter Saved");
		}
		else
		{
			System.out.println("Unfortunatly Encounter not saved");
		}
	}
	
	
	public Encounter getEncounterById(int eid)
	{
		EncounterDaoImp  encounterDaoImp = new EncounterDaoImp();
		Encounter encounter = encounterDaoImp.getEncounter(eid);
		if(encounter != null)
		{
			return encounter;
		}
		else
		{
			return null;
		}
	}
	public void deleteEncounterById(int eid)
	{
		EncounterDaoImp  encounterDaoImp = new EncounterDaoImp();
		boolean flag =encounterDaoImp.deleteEncounter(eid);
		if(flag )
		{
			System.out.println("Encounter deleted");
		}
		else
		{
			System.out.println("Encounter not deleted");
		}
	}
	public Encounter updataEncounterById(int eid,Encounter encounter)
	{
		EncounterDaoImp  encounterDaoImp = new EncounterDaoImp();
		Encounter encounter1 = encounterDaoImp.updateEncounterId(eid, encounter);
		if(encounter1 != null)
		{
			return encounter1;
		}
		else
		{
			return null;
		}
	}

}
