package com.shxt.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.shxt.mapper.UserMapper;
import com.shxt.model.User;
import com.shxt.utils.MyBatisUtils;

public class MyBatisTest {
	@Test
	public void SQLID的方式(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			
			User user = sqlSession.selectOne(UserMapper.class.getName()+".load", 3);//namspace+"."+id是属于SQLID的方式
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
	}
	@Test
	public void 接口方式_推荐方式(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			User user = sqlSession.getMapper(UserMapper.class).load(3);
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
	}
	
	@Test
	public void 使用Map传递多个参数_推荐方式(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			Map<String,Object> map = new HashMap<>();
			map.put("user_name", "林");
			map.put("status", "1");
			
			sqlSession.getMapper(UserMapper.class).listByStatusName01(map);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
	}
	
	@Test
	public void 接口方式形参多于1个情况(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			
			
			sqlSession.getMapper(UserMapper.class).listByStatusName02("林", "1");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
	}
	@Test
	public void 接口方式形参多于1个情况2(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			Map<String,Object> map1 = new HashMap<String,Object>();
			map1.put("shxt_name", "林");
			
			Map<String,Object> map2 = new HashMap<String,Object>();
			map2.put("shxt_status", "1");
			
			sqlSession.getMapper(UserMapper.class).listByStatusName03(map1, map2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
	}
	
	@Test
	public void Where语句01(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("user_name", "林");
			//map.put("status", "1");
			
	
			
			sqlSession.getMapper(UserMapper.class).listByWhere03(map);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
	}
	
	@Test
	public void 更新01(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			User user = new User();
			user.setAccount("2222");
			user.setUserName("2222");
			user.setPwd("2222");
			user.setStatus("2");
			user.setUserId(3);
			
			sqlSession.getMapper(UserMapper.class).update01(user);
			
			sqlSession.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
	}
	
	@Test
	public void 查询(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			List<Integer> dataList = new ArrayList<>();
			dataList.add(1);
			dataList.add(2);
			dataList.add(3);
			
			//sqlSession.getMapper(UserMapper.class).update01(user);
			
			//sqlSession.commit();
			
			sqlSession.getMapper(UserMapper.class).for01(dataList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
	}
	
	@Test
	public void 批量(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			
			List<User> userList = new ArrayList<>();
			User user = new User();
			user.setAccount("lindaiyu");
			user.setPwd("123456");
			user.setUserName("林黛玉");
			userList.add(user);
			user = new User();
			user.setAccount("jiabaoyu");
			user.setPwd("123456");
			user.setUserName("贾宝玉");
			userList.add(user);
			user = new User();
			user.setAccount("jiabaoyu");
			user.setPwd("123456");
			user.setUserName("贾宝玉");
			userList.add(user);
			
			sqlSession.getMapper(UserMapper.class).batchInsert(userList);
			
			sqlSession.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
	}
}
