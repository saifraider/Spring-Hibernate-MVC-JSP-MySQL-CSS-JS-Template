package com.saif.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.saif.dao.Dao;

@Controller
public class MainController {
	
	@Autowired Dao dao;
	
	@RequestMapping("/secondPage")  
    public ModelAndView SecondPage(HttpServletRequest request,HttpServletResponse res) {  
		System.out.println("in main Controller");
		int z = dao.add(25, 10);
		System.out.println("in main Controller");
		return new ModelAndView("second","message",z); 
    }
	
}
