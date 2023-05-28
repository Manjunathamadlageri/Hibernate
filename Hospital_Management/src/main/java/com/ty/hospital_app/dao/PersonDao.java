package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Person;

public interface PersonDao 
{
	public Person savaPerson(int eid,Person persons);

	public Person getPersonId(int pid);

	public boolean deletePersonId(int pid);

	public Person updatePerson(int pid,Person persons);
	
	public List<Person> getAllPerson();
	
	public List<Person> getPersonByAge(int age);
	
	public List<Person> getPersonByGender(String gernder);
	
	public List<Person> getPersonByPhono(long phono);
}
