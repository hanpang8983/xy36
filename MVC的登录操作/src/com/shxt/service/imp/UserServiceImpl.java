package com.shxt.service.imp;

import org.apache.ibatis.session.SqlSession;

import com.shxt.mapper.UserMapper;
import com.shxt.model.User;
import com.shxt.service.IUserService;
import com.shxt.utils.MyBatisUtils;

public class UserServiceImpl implements IUserService {

	@Override
	public User login(String account, String password) {
		SqlSession sqlSession=null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			
			User user = sqlSession.getMapper(UserMapper.class).login(account, password);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MyBatisUtils.closeSqlSession(sqlSession);
		}
		return null;
	}

}
