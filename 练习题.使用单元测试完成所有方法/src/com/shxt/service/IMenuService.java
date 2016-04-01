package com.shxt.service;

import java.util.List;

import com.shxt.model.Menu;

public interface IMenuService {
	/**
	 * 描述:通过角色主键ID获取拥有的子节点信息
	 * @param role_id
	 * @return List<Menu>
	 */
	public List<Menu> getLeftMenuList(Integer role_id);
	/**
	 * 描述:通过角色主键ID获取拥有的子节点信息的父节点列表
	 * @param role_id
	 * @return List<Menu>
	 */
	public List<Menu> getLeftParentMenuList(Integer role_id);
	/**
	 * 描述:通过父节点ID获取对应的子节点列表
	 * @param parent_id
	 * @return List<Menu>
	 */
	public List<Menu> getMenuListByParentId(Integer parent_id);
	/**
	 * 描述:菜单的添加操作,返回主键
	 * @param menu
	 * @
	 */
	public int add(Menu menu);
	/**
	 * 描述:菜单的更新操作
	 * @param menu
	 * @
	 */
	public void update(Menu menu);
	/**
	 * 描述:验证菜单名称是否重复
	 * @param menu_name 菜单名称
	 * @param parent_id 父节点ID
	 * @
	 */
	public void validation(String menu_name,Integer parent_id);
	/**
	 * 描述:通过主键获取菜单对象信息
	 * @param menu_id
	 * @return com.hanpang.framework.rbac.menu.model.Menu
	 */
	public Menu load(Integer menu_id);
	/**
	 * 描述:通过菜单主键删除子节点信息
	 * @param menu_id
	 * @
	 */
	public void deleteChildMenu(Integer menu_id);
	/**
	 * 描述:通过菜单主键删除父节点信息
	 * @param menu_id
	 * @
	 */
	public void deleteParentMenu(Integer menu_id);
}
