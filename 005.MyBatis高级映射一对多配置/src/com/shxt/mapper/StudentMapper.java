package com.shxt.mapper;

import java.util.List;

import com.shxt.model.Student;

public interface StudentMapper {

	public List<Student> listStudentByClassId(Integer class_id);
	
	public Student m2m01(Integer student_id);
	
	public Student load(Integer student_id);
	
	public void add01(Student student);

}
