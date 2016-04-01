package com.shxt.mapper;

import com.shxt.model.User;

public interface UserMapper {
	
	User login(String account,String password);

}
