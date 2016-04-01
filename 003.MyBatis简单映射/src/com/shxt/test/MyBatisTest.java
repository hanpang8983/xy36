package com.shxt.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.shxt.mapper.UserMapper;
import com.shxt.model.User;
import com.shxt.utils.MyBatisUtils;

public class MyBatisTest {
	
	@Test
	public void 获取对象信息通过主键方式(){
		SqlSession sqlSession = null;
		try {
			sqlSession= MyBatisUtils.getSqlSession();
			
			User user = sqlSession.getMapper(UserMapper.class).load03(20);
			System.out.println(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MyBatisUtils.closeSqlSession(sqlSession);
		}
	}
	
	@Test
	public void 添加操作(){
		SqlSession sqlSession = null;
		try {
			sqlSession= MyBatisUtils.getSqlSession();
			User user = new User();
			user.setAccount("wangnima");
			user.setPwd("2222222");
			user.setUserName("王尼玛");
			//user.setDate1(new Date());
			
			sqlSession.getMapper(UserMapper.class).add(user);
			
			sqlSession.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MyBatisUtils.closeSqlSession(sqlSession);
		}
	}
	
	@Test
	public void 时间转换() throws ParseException{
		String date="2016-03-20 13:45:55";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date2 = sdf.parse(date);
		System.out.println(date2.getTime());
	}
}
