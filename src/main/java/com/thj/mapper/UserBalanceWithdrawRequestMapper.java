package com.thj.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.thj.model.UserBalanceWithdrawRequest;

public interface UserBalanceWithdrawRequestMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserBalanceWithdrawRequest record);

    int insertSelective(UserBalanceWithdrawRequest record);

    UserBalanceWithdrawRequest selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserBalanceWithdrawRequest record);

    int updateByPrimaryKey(UserBalanceWithdrawRequest record);
    
    @Select("select * from lg_crowd_article.lg_user_balance_withdraw_request_t limit 10")
    List<Map<String, Object>> queryList();
}