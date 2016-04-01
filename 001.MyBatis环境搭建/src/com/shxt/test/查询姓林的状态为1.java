package com.shxt.test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.shxt.model.User;

public class 查询姓林的状态为1 {

	public static void main(String[] args) {
		//1.读取核心配置文件
		String path = "mybatis-config.xml";
		SqlSession sqlSession = null;
		try {
			InputStream inputStream = Resources.getResourceAsStream(path);
			//2.创建SQLSessionFactory工厂  -- 相当于Connetion
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//3.创建SqlSession -- 相当于Statement对象
			sqlSession = sessionFactory.openSession();
			
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("name", "林");
			map.put("status", "1");
			
			
			List<User> userList = sqlSession.selectList(User.class.getName()+".listByNameStatus",map);
			for (User user : userList) {
				System.out.println(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//4.关闭资源
			if(sqlSession!=null)sqlSession.close();
		}
	
	}

}
