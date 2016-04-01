package com.shxt.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.shxt.model.User;

public class 通过主键进行删除 {

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
			//4.执行语句
			int rownum = sqlSession.delete("shxt.xy36.delete", 6);//namespace+"."+id
			
			System.out.println(rownum);
			//5.提交事务--只有针对于改变数据库的操作的时候，才使用事务
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(sqlSession!=null)sqlSession.rollback();//回滚
		}finally {
			//6.关闭资源
			if(sqlSession!=null)sqlSession.close();
		}
	
	}

}
