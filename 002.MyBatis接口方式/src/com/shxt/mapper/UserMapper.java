package com.shxt.mapper;

import java.util.List;
import java.util.Map;

import com.shxt.model.User;

public interface UserMapper {
	
	//public resutType 方法名为id(参数类型)
	
	public User load(Integer shxt);
	
	public List<User> listByStatusName01(Map<String,Object> map);
	
	public List<User> listByStatusName02(String userName,String status);
	
	public List<User> listByStatusName03(Map<String,Object> userNameMap,Map<String,Object> statusMap);
	
	public List<User> listByWhere01(Map<String,Object> map);
	
	public List<User> listByWhere02(Map<String,Object> map);
	public List<User> listByWhere03(Map<String,Object> map);
	
	public void update01(User user);
	
	public List<User> for01(List<Integer> dataList);
	
	public void batchInsert(List<User> dataList);
	
	
}
