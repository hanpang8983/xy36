package com.shxt.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.shxt.mapper.StudentMapper;
import com.shxt.model.Student;
import com.shxt.utils.MyBatisUtils;

public class MyBatisTest {
	
	@Test
	public void 主键加载数据(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			
			Student student = sqlSession.getMapper(StudentMapper.class).load01(2);
			
			System.out.println(student.getStudent_id());
			System.out.println(student.getStudent_name());
			System.out.println(student.getFk_class_id());
			System.out.println(student.getClazz().getClass_id());
			System.out.println(student.getClazz().getClass_name());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
		
	}
	
	@Test
	public void 获取全部信息(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			
			sqlSession.getMapper(StudentMapper.class).list();
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
		
	}


}
