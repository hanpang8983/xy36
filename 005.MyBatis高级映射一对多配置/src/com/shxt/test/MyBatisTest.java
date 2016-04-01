package com.shxt.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.shxt.mapper.ClazzMapper;
import com.shxt.mapper.StudentMapper;
import com.shxt.model.Clazz;
import com.shxt.model.Course;
import com.shxt.model.Student;
import com.shxt.utils.MyBatisUtils;

public class MyBatisTest {
	
	@Test
	public void 通过班级的主键信息获取拥有的学生_传统方式(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			
			Clazz clazz = sqlSession.getMapper(ClazzMapper.class).load(200);
			
			System.out.println("班级的主键ID"+clazz.getClass_id()+",通过执行查询学生表");
			
			List<Student> studentList=sqlSession.getMapper(StudentMapper.class).listStudentByClassId(clazz.getClass_id());
			
			clazz.setStudentList(studentList);
			
			System.out.println(clazz);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
		
	}
	
	@Test
	public void 通过班级的主键信息获取拥有的学生_MyBatis_Select方式(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			Clazz clazz = sqlSession.getMapper(ClazzMapper.class).load_mybatis_select(200);
			
			System.out.println(clazz);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
		
	}
	
	@Test
	public void 通过班级的主键信息获取拥有的学生_N加1问题(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			List<Clazz> list = sqlSession.getMapper(ClazzMapper.class).listAll();
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
		
	}
	
	@Test
	public void 通过班级的主键信息获取拥有的学生_MyBatis_ResultMap方式_第一种(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			Clazz clazz =sqlSession.getMapper(ClazzMapper.class).resultMap_01(200);
			
			System.out.println(clazz);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
		
	}
	
	@Test
	public void 通过班级的主键信息获取拥有的学生_MyBatis_ResultMap方式_第二种(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
		
	}
	
	
	@Test
	public void 提高效率_如果字段相同_使用别名方式解决(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
		
	}
	
	//题目:已知条件学生ID为2，获取该学生信息，其中包含其课程信息
	//控制台输出的: 2 林冲  所选课程信息
	
	@Test
	public void 用户拥有的课程(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			
			Student student = sqlSession.getMapper(StudentMapper.class).m2m01(2);
			System.out.println(student);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
		
	}
	
	@Test
	public void 保存数据到中间表(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			Student student = sqlSession.getMapper(StudentMapper.class).load(4);
			List<Course> courseList = new ArrayList<>();
			Course c = new Course();
			c.setCourse_id(1000);
			courseList.add(c);
			c = new Course();
			c.setCourse_id(2000);
			courseList.add(c);
			c = new Course();
			c.setCourse_id(3000);
			courseList.add(c);
			
			student.setCourseList(courseList);
			
			
			
			
			
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtils.closeSqlSession(sqlSession);
		}
		
	}
	@Test
	public void test01(){
		int i =5;
	    
	    int sum = i+(i+(i+(++i)));
	    System.out.println(sum);
	}

}
