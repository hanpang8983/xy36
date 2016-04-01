package com.shxt.service;

import java.util.List;

import com.shxt.model.User;

public interface IUserService {
	/**
	 * 添加返回主键
	 * @param user
	 * @return
	 */
	public int add(User user);
	
	public void update(User user);
	
	public void delete(Integer user_id);
	
	public User load(Integer user_id);
	/**
	 * 通过用户账号和密码,获取用户信息其中需要包含角色对象
	 * @param account
	 * @param password
	 * @return
	 */
	public User login(String account,String password);
	
	public int validation(String account);
	/**
	 * 获取用户信息，并且含有角色名称
	 * @return
	 */
	public List<User> list();

}
