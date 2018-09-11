package com.training.ata.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.ata.bean.CredentialsBean;
import com.training.ata.service.UserService; 

@Controller

public class LoginController

{
	@Autowired
	UserService userService;

	@RequestMapping("/")
     public String showHome() {
    	 return "index";
     }

    @RequestMapping("/login")
    public String displayLogin(Model model)

    {
    	model.addAttribute("credentialsBean",new CredentialsBean());               
        return "login";
    }
    @RequestMapping(value="/processLogin",method=RequestMethod.POST)
    public ModelAndView processLogin(@ModelAttribute("credentialsBean") CredentialsBean cb) {
    	
    	
    			try {
					boolean result=userService.isValidUser(cb.getUserID(), cb.getPassword());
					if(result) {
						return new ModelAndView("success");
					}
					else {
						return new ModelAndView("error");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			return null;
    }

    

}
