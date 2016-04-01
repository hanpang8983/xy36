package com.shxt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shxt.model.User;
import com.shxt.service.IUserService;
import com.shxt.service.imp.UserServiceImpl;

@Controller
public class LoginController {
	@RequestMapping("/sys/login")
	public ModelAndView login(HttpServletRequest request){
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		
		IUserService userService = new UserServiceImpl();
		
		User user = userService.login(account, password);
		ModelAndView mav = new ModelAndView();
		if(user!=null){
			mav.setViewName("jsp/main");
		}else{
			mav.setViewName("jsp/login");
		}
		
		
		return mav;
	}

}
