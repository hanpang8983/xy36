package com.shxt.service;

import java.util.List;

import com.shxt.model.Menu;
import com.shxt.model.Role;

public interface IRoleService {
	/**
	 * 描述:获取所有的角色信息
	 * @return
	 */
	public List<Role> list();
	/**
	 * 描述:通过主键获取角色对象
	 * @param role_id
	 * @return
	 */
	public Role load(Integer role_id);
	/**
	 * 描述:添加角色操作,返回主键
	 * @param role
	 */
	public int add(Role role);
	/**
	 * 描述:更新角色操作
	 * @param role
	 * @throws RbacException
	 */
	public void update(Role role);
	/**
	 * 描述:删除角色操作
	 * 	实际上操作了中间表信息/用户表/角色表
	 * @param role
	 */
	public void delete(Integer role_id);
	/**
	 * 通过角色主键信息，获取该角色拥有的菜单信息
	 * @param role_id
	 * @return
	 */
	public List<Menu> getSelectedMenuByRoleId(Integer role_id);
	/**
	 * 通过角色主键信息，得到该角色未曾选择的角色信息
	 * @param role_id
	 * @return
	 */
	public List<Menu> getUnSelectedMenuByRoleId(Integer role_id);
	/**
	 * 描述:跟新该角色拥有的权限[其实就是操作中间表的维护]
	 * @param role_id
	 * @param menus
	 */
	public void updateRolePermission(Integer role_id,Integer[] menus);
	/**
	 * 检查角色名称是否重复
	 * @param role_name
	 * @throws RbacException
	 */
	public void validation(String role_name);
}
