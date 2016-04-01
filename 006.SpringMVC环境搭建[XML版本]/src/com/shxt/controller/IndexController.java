package com.shxt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		System.out.println("================");
		
		//mav.setViewName(InternalResourceViewResolver.REDIRECT_URL_PREFIX+"mvc.jsp");
		
		mav.setViewName("shxt");
		//prefix+shxt+suffix
		
		return mav;
	}

}
