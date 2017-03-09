package com.partner.hlife.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {
	@RequestMapping(value ="/welcome.pay") 
	public String index(HttpServletRequest request, HttpServletResponse response){ 
		return "welcome"; 
		}

}
