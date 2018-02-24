package com.thj.api.imp;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.thj.api.TestApiRest;
import com.thj.model.UserBalanceWithdrawRequest;
import com.thj.service.TestApiService;

/**
 *@author thj
 *@time	  2018-02-23 14:47:16
 */
@Component
public class TestApiRestImp implements TestApiRest {

	@Autowired
	TestApiService testApiService;
	
	@Override
	public void print() {
		testApiService.print();
		Logger logger = Logger.getRootLogger();
		logger.info("测试日志");
	}

	@Override
	public Object rtu() {
		Logger logger = Logger.getRootLogger();
		logger.info("测试日志");
		return testApiService.rtu();
	}

	@Override
	public Object testAcceptJsonString(@RequestBody UserBalanceWithdrawRequest ub) {
		return ub;
	}

}


