package com.drzinks.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.RequestMatchResult;

import com.drzinks.dao.ContactCrudRepository;
import com.drzinks.dao.ContactDAO;
import com.drzinks.domain.Contact;

/**
 * Created by golebiow on 2016-03-10.
 */
@Controller
public class WelcomeController {

	@Autowired
	private ContactCrudRepository contactCrudRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET) 			// home 
	public ModelAndView returnWelcomeView(ModelAndView modelAndView) {
		List<Contact> listContact = contactCrudRepository.findAll();
		modelAndView.addObject("listContact", listContact);
		modelAndView.setViewName("home");
		return modelAndView;
	}

	@RequestMapping(value = "/contacts", method = RequestMethod.GET) // homepage   -> newContact 
	public ModelAndView addNewContact(ModelAndView modelAndView) {
		Contact newContact = new Contact();
		modelAndView.addObject("contact", newContact);
		modelAndView.setViewName("contactForm");
		return modelAndView;
	}
	
	@RequestMapping(value = "/contacts", method = RequestMethod.POST) // newContact ->  homepage
	public ModelAndView submitNewContact(@ModelAttribute Contact contact) {
		contactCrudRepository.save(contact);
		return new ModelAndView("redirect:/");
	}

	
	@RequestMapping(value = "/contacts/{contactId}", method = RequestMethod.DELETE) // deleteContact
	public ModelAndView deleteContact(@PathVariable long contactId) {
		contactCrudRepository.delete(contactId);
		return new ModelAndView("redirect:/");
	}
	
	
//	@RequestMapping(value = "/contacts/{contactId}", method = RequestMethod.PUT) // update
//	public ModelAndView updateContact(@PathVariable long contactId) {
//		contactCrudRepository.delete(contactId);
//		return new ModelAndView("redirect:/");
//	}	
}
