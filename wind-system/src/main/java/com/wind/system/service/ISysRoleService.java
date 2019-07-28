package com.wind.system.service;


import com.wind.system.model.SysRole;

import java.util.List;

/**
 * 角色业务层
 * 
 * @author ruoyi
 */
public interface ISysRoleService
{
    /**
     * 根据条件分页查询角色数据
     * 
     * @param role 角色信息
     * @return 角色数据集合信息
     */
    public List<SysRole> selectRoleList(SysRole role);

}
