package com.wf.ew.system.service;

import java.util.List;

import com.wf.ew.core.PageResult;
import com.wf.ew.core.exception.BusinessException;
import com.wf.ew.core.exception.ParameterException;
import com.wf.ew.system.model.Permission;

/**
 * 菜单Menu操作相关的service
 * 
 * @author wangfan
 * @date 2017-4-27 下午5:27:11
 */
public interface PermissionService {

	/**
	 * 获取用户的菜单导航
	 */
	public List<Permission> getMenusByUser(String userId);

	/**
	 * 根据角色id查询权限
	 */
	public List<Permission> getPermissionsByRole(String roleId);

	/**
	 * 查询所有权限
	 */
	public PageResult<Permission> getPermissions(Integer page, Integer limit, String searchKey, String searchValue);

	/**
	 * 查询权限或按钮的父级列表
	 */
	public List<Permission> getParentPermissions(int type);

	/**
	 * 添加权限
	 */
	public boolean addPermission(Permission permission);

	/**
	 * 修改权限
	 */
	public boolean updatePermission(Permission permission);

	/**
	 * 修改权限状态
	 */
	public boolean updatePermissionStatus(String permissionId, int isDelete) throws ParameterException;
	
	/**
	 * 删除权限
	 */
	public boolean deletePermission(String permissionId) throws BusinessException;

}
