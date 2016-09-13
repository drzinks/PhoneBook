package com.drzinks.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.drzinks.domain.Contact;

public interface ContactCrudRepository extends CrudRepository<Contact, Long> {

	public List<Contact> findAll();
	
}
