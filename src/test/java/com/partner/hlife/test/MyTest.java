package com.partner.hlife.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.partner.hlife.service.TestService;

/** 
 * @Title: MyTest.java 
 * @Package com.partner.hlife.test 
 * @Description: TODO(添加描述) 
 * @author changjiwang
 * @date 2016年11月17日 上午10:14:56 
 */
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations = {"classpath:spring/application.xml"}) 
@ActiveProfiles("test")
public class MyTest  extends AbstractJUnit4SpringContextTests{ 
	  
	    @Autowired  
	    private TestService service;  
	  
	    @Test  
	    public void test() {  
	           Long num=service.getUserCount();  
	           System.out.println("测试用户总数："+num); 
	    }  
	      
 

}
