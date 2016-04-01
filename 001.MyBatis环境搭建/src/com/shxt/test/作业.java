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

public class 作业 {

	public static void main(String[] args) {

		// 1.读取核心配置文件
		String path = "mybatis-config.xml";
		SqlSession sqlSession = null;
		try {
			InputStream inputStream = Resources.getResourceAsStream(path);
			// 2.创建SQLSessionFactory工厂 -- 相当于Connetion
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			// 3.创建SqlSession -- 相当于Statement对象
			sqlSession = sessionFactory.openSession();
			
			/*User user1 = new User();
			user1.setUserName("'林%'");
			System.out.println(User.class.getName());*/
			
			Map<String,Object> map = new HashMap<>();
			map.put("haha", "'林%'");
			
			List<User> userList = sqlSession.selectList(User.class.getName()+".listByUserName01", "林%");
			for (User user : userList) {
				System.out.println(user);
			}
					

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4.关闭资源
			if (sqlSession != null)
				sqlSession.close();
		}

	}

}
