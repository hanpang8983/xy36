package com.shxt.test;

import com.shxt.model.User;
import com.shxt.service.IUserService;
import com.shxt.service.impl.UserServiceImpl;

public class UserTest {

	
	public void 用户添加测试(){
		IUserService userService = new UserServiceImpl();
		User user = new User();
		//user.set
		userService.add(user);
	}
}
