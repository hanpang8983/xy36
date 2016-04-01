package com.shxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestController {
	
	//访问路径
	@RequestMapping(value="/req",method=RequestMethod.GET)
	public ModelAndView test01(){
		System.out.println("=======test01==查询=======");
		
		return null;
	}
	@RequestMapping(value="/req",method=RequestMethod.POST)
	public ModelAndView test02(){
		System.out.println("=======test02===添加======");
		
		return null;
	}
	@RequestMapping(value="/req",method=RequestMethod.DELETE)
	public ModelAndView test03(){
		System.out.println("=======test03====删除=====");
		
		return null;
	}
	@RequestMapping(value="/req",method=RequestMethod.PUT)
	public ModelAndView test04(){
		System.out.println("=======test04====更新=====");
		
		return null;
	}

}
