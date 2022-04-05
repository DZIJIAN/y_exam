package com.dzj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dzj.entity.UserRole;

import java.util.List;

/**
 * @author by dzj
 * @implNote 2021/10/20 19:49
 */
public interface UserRoleService extends IService<UserRole> {

    String getMenuInfo(Integer roleId);

    List<UserRole> getUserRole();
}
