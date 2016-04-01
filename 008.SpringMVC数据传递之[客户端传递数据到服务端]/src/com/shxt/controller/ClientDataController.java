package com.shxt.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shxt.model.Role;
import com.shxt.model.User;

@Controller
public class ClientDataController {
	
		@RequestMapping(value="/client01",method=RequestMethod.GET)
		public ModelAndView test01(@RequestParam(name="id",required=false,defaultValue="777")Integer userId){
			System.out.println("=======test01==一个参数值为======="+userId);
			
			return null;
		}
		@RequestMapping(value="/client02",method=RequestMethod.GET)
		public ModelAndView test02(@RequestParam(name="id")Integer userId,@RequestParam(name="name")String userName){
			System.out.println("=======test01==两个参数==="+userId+"===="+userName);
			
			return null;
		}
		@RequestMapping(value="/client03",method=RequestMethod.GET)
		public ModelAndView test03(Integer id,String name){
			System.out.println("=======test01==推荐方式=="+id+"====="+name);
			return null;
		}
		
		@RequestMapping(value="/client04",method=RequestMethod.POST)
		public ModelAndView test04(String[] hobbys){
			System.out.println("=======test01==推荐方式==复选框====="+Arrays.asList(hobbys));
			return null;
		}
		@RequestMapping(value="/client05",method=RequestMethod.POST)
		public ModelAndView test05(String[] clazz){
			if(clazz!=null){
				System.out.println("=======test01==推荐方式==复选框====="+Arrays.asList(clazz));
			}
			
			return null;
		}
		@RequestMapping(value="/client06",method=RequestMethod.POST)
		public ModelAndView test06(User user,Role role){
			System.out.println(user);
			System.out.println(role);
			
			return null;
		}
}
