package com.thj.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thj.mapper.UserBalanceWithdrawRequestMapper;
import com.thj.model.UserBalanceWithdrawRequest;
import com.thj.service.TestApiService;

/**
 *@author thj
 *@time	  2018-02-23 14:42:50
 */
@Service
@Transactional
public class TestApiServiceImp implements TestApiService{

	@Autowired
	UserBalanceWithdrawRequestMapper userBalanceWithdrawRequestMapper;
	
	@Override
	public void print() {
		System.out.println(userBalanceWithdrawRequestMapper.queryList());
		UserBalanceWithdrawRequest ub = new UserBalanceWithdrawRequest();
		ub.setAdminUserId(111L);
		ub.setArriveAccount("aa");
		ub.setArriveAccountName("bb");
		ub.setArriveTel("123456");
		ub.setArriveType(1);
		ub.setAuditExplain("rrrrr");
		ub.setBankId(111L);
		ub.setCreateTime(123445L);
		ub.setNum(11);
		ub.setPayNum(44);
		ub.setUserId(22L);
		ub.setLastTime(555l);
		userBalanceWithdrawRequestMapper.insertSelective(ub);
		
	}

	@Override
	public Object rtu() {
		UserBalanceWithdrawRequest ub = new UserBalanceWithdrawRequest();
		ub.setAdminUserId(111L);
		ub.setArriveAccount("aa");
		ub.setArriveAccountName("bb");
		ub.setArriveTel("123456");
		ub.setArriveType(1);
		ub.setAuditExplain("rrrrr");
		ub.setBankId(111L);
		ub.setCreateTime(123445L);
		ub.setNum(11);
		ub.setPayNum(44);
		ub.setUserId(22L);
		ub.setLastTime(555l);
		return ub;
	}

}


