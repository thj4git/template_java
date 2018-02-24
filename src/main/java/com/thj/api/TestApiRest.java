package com.thj.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thj.model.UserBalanceWithdrawRequest;

/**
 *@author thj
 *@time	  2018-02-23 14:44:03
 */
@RestController
@RequestMapping("tar")
public interface TestApiRest {
	
	@RequestMapping("p")
	 void print() ;
	
	@RequestMapping("r")
	 Object rtu() ;
	/**
	 * 测试接收json字符串数据
	 * @param ub
	 * @return
	 */
	@RequestMapping("tj")
	Object testAcceptJsonString(UserBalanceWithdrawRequest ub);
}


