package com.wf.ew.system.service;

import com.wf.ew.core.PageResult;
import com.wf.ew.core.exception.BusinessException;
import com.wf.ew.core.exception.ParameterException;
import com.wf.ew.system.model.Role;

/**
 * 角色操作相关的service
 * 
 * @author wangfan
 * @date 2017-4-27 下午5:37:20
 */
public interface RoleService {
	
	/**
	 * 查询所有角色
	 */
	public PageResult<Role> getRoles(int pageNum, int pageSize, String searchKey, String searchValue, Integer isDelete);

	/**
	 * 根据id查询角色
	 */
	public Role getRoleById(String roleId);

	/**
	 * 添加角色
	 */
	public boolean addRole(Role role);

	/**
	 * 修改角色
	 */
	public boolean updateRole(Role role);

	/**
	 * 修改角色状态
	 */
	public boolean updateRoleStatus(String roleId, int isDelete) throws ParameterException;

	/**
	 * 删除角色
	 */
	public boolean deleteRole(String roleId) throws BusinessException ;

}
