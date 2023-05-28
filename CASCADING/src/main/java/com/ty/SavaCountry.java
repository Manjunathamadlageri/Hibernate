package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavaCountry {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Country country = new Country();
		country.setName("India");
		country.setPm("Modi");
		country.setPopulation("50 Crore");
		country.setNoofstates(30);
		
		Country country1 = new Country();
		country1.setName("US");
		country1.setPm("Tom");
		country1.setPopulation("30 Crore");
		country1.setNoofstates(21);
		
		
		
		State state = new  State();
		state.setName("Karnataka");
		state.setCm("Basavaraj");
		state.setLanguage("Kannad");
		state.setPopulation("5 Crore");
		
		State state1 = new  State();
		state1.setName("Talangan");
		state1.setCm("Jaganmohan");
		state1.setLanguage("Telagu");
		state1.setPopulation("6 Crore");
		
		
		State state2 = new  State();
		state2.setName("TamilNadu");
		state2.setCm("Standly");
		state2.setLanguage("Tamil");
		state2.setPopulation("6 Crore");
		
		State state3 = new  State();
		state3.setName("Wasington");
		state3.setCm("Jony");
		state3.setLanguage("English");
		
		state3.setPopulation("4 Crore");
		
		State state4 = new  State();
		state4.setName("Wasington");
		state4.setCm("Jony");
		state4.setLanguage("English");
		state4.setPopulation("4 Crore");
		
		
		State state5 = new  State();
		state5.setName("Wasington");
		state5.setCm("Jony");
		state5.setLanguage("English");
		state5.setPopulation("4 Crore");
		
		
		List<State> list1 = new ArrayList<State>();
		list1.add(state);
		list1.add(state1);
		list1.add(state2);
		
		List<State> list2 = new ArrayList<State>();
		list2.add(state3);
		list2.add(state4);
		list2.add(state5);
		
		country.setStates(list1);
		country1.setStates(list2);
		
		state.setCountrys(country);
		state1.setCountrys(country);
		state2.setCountrys(country);
		state3.setCountrys(country1);
		state4.setCountrys(country1);
		state5.setCountrys(country1);

		
		
		
		entityTransaction.begin();
		entityManager.persist(country);
		entityManager.persist(country1);
		entityTransaction.commit();
	}
}
