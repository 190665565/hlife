package com.partner.hlife.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class Test {
	
	@RequestMapping("/hello.pay")
    public String hello(String param){  

		if("url".equals(param)){
			return retUrl("https://www.baidu.com");
		}
		
		return "{json:1}";
        
    }
	
	
	
	public String retUrl(String url){
		return "redirect:"+url;
	}
	public String retJson(String json){
		return json;
	}
	
	@RequestMapping("/hello.action")
	@ResponseBody
    public String hello1(HttpServletResponse response, String type){        
		 if("json".equals(type)){
	            String result = "********";
	            return result;
	        } else if("html".equals(type)){
	            try {
					response.sendRedirect("https://www.baidu.com");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
		 return "";
    }

}
