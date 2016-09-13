package com.drzinks.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.drzinks.dao.ContactCrudRepository;
import com.drzinks.dao.ContactDAO;
import com.drzinks.domain.Contact;

/**
 * Created by golebiow on 2016-03-10.
 */
@Controller
public class WelcomeController {

	@Autowired
	private ContactDAO contactDao;
	
	@Autowired
	private ContactCrudRepository contactCrudRepository;
//    @RequestMapping("/welcome")
//    public @ResponseBody WelcomeDTO returnWelcomeView() {
//        WelcomeDTO welcomeDTO = new WelcomeDTO();
//        welcomeDTO.setWelcomeMessage("welc message");
//        welcomeDTO.setTitle("tytul");
//        return welcomeDTO;
//    }


  @RequestMapping(value="/")
  public ModelAndView returnWelcomeView(ModelAndView model) {
//	  List<Contact> listContact = contactDao.getFirstContact();
	  List<Contact> listContact = contactCrudRepository.findAll();
	  model.addObject("listContact", listContact);
	  model.setViewName("home");
      return model;
  }

}
