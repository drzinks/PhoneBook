package com.drzinks.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.drzinks.domain.Contact;

@Repository
public class ContactDAO {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Contact> getFirstContact(){
		List<Contact> returnList = new ArrayList<Contact>();
		returnList.add(entityManager.find(Contact.class, 1L)); //TODO: how to obtain all???
		return returnList;
	}

}
