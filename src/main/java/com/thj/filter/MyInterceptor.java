package com.thj.filter;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

/**
 *@author thj
 *@time	  2018-02-24 10:18:58
 */
public class MyInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("-----------");
		System.out.println(request.getHeader("pwd"));
		System.out.println("-----------");
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
}


