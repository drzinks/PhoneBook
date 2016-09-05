package com.drzinks.controllers;

import com.drzinks.dtos.WelcomeDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by golebiow on 2016-03-10.
 */
@Controller
public class WelcomeController {

//    @RequestMapping("/welcome")
//    public @ResponseBody WelcomeDTO returnWelcomeView() {
//        WelcomeDTO welcomeDTO = new WelcomeDTO();
//        welcomeDTO.setWelcomeMessage("welc message");
//        welcomeDTO.setTitle("tytul");
//        return welcomeDTO;
//    }


  @RequestMapping(value="/")
  public ModelAndView returnWelcomeView(ModelAndView model) {
      model.setViewName("home");
      return model;
  }

}
