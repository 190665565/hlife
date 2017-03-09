package com.partner.hlife.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.partner.hlife.dao.account.TestMapper;
import com.partner.hlife.service.TestService;

/** 
 * @Title: TestServiceImpl.java 
 * @Package com.partner.hlife.service.impl 
 * @Description: TODO(添加描述) 
 * @author changjiwang
 * @date 2016年11月17日 上午10:12:41 
 */
@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestMapper testmapper;
	
	public long getUserCount() {
		// TODO Auto-generated method stub
		return testmapper.getCount();
	}


}
