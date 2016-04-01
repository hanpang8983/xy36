package com.shxt.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.shxt.model.User;
import com.shxt.service.IUserService;
import com.shxt.utils.MyBatisUtils;

public class UserServiceImpl implements IUserService {

	@Override
	public int add(User user) {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			
			//return sqlSession.getMapper(UserMapper.class).add(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MyBatisUtils.closeSqlSession(sqlSession);
		}
		return 0;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer user_id) {
		// TODO Auto-generated method stub

	}

	@Override
	public User load(Integer user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(String account, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int validation(String account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
