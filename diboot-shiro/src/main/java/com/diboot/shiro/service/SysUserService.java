package com.diboot.shiro.service;

import com.diboot.core.service.BaseService;
import com.diboot.shiro.entity.SysUser;

/**
 * 用户相关Service
 * @author Yangzhao
 * @version v2.0
 * @date 2019/6/6
 */
public interface SysUserService extends BaseService<SysUser> {

    /**
     * 注册用户
     * @param sysUser
     * @return
     * @throws Exception
     */
    boolean register(SysUser sysUser) throws Exception;

}