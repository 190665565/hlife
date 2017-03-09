package com.partner.hlife.dao.account;

import org.apache.ibatis.annotations.Select;

/** 
 * @Title: TestMapper.java 
 * @Package com.partner.hlife.dao.account 
 * @Description: 测试数据库
 * @author changjiwang
 * @date 2016年11月17日 上午10:03:00 
 */

public interface TestMapper {
	@Select("select count(0) from t_test_user")
	public long getCount();
	
	

}
