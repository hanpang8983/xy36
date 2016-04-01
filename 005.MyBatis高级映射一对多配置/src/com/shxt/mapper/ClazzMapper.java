package com.shxt.mapper;

import java.util.List;

import com.shxt.model.Clazz;

public interface ClazzMapper {
	
	public Clazz load(Integer class_id);
	
	public Clazz load_mybatis_select(Integer class_id);
	
	public List<Clazz> listAll();
	
	public Clazz resultMap_01(Integer class_id);

}
