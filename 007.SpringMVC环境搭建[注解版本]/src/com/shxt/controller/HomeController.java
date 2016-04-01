package com.shxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sys/user")
public class HomeController {
	@RequestMapping(value={"/shxt","/wukong"},params={"shxt!=tomcat"},method=RequestMethod.GET)
	public ModelAndView test01(){
		System.out.println("00000000000000");
		return null;
	}
	
	@RequestMapping(value="/shxt",method=RequestMethod.POST)
	public ModelAndView test02(){
		System.out.println("123123123");
		return null;
	}
	@RequestMapping(value="/xy36",method=RequestMethod.GET)
	public ModelAndView test03(){
		System.out.println("123123123");
		return null;
	}

}
