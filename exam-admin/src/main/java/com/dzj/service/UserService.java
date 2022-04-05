package com.dzj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dzj.dto.AddUserDto;
import com.dzj.dto.LoginDto;
import com.dzj.dto.RegisterDto;
import com.dzj.dto.UpdateUserInfoDto;
import com.dzj.entity.User;
import com.dzj.vo.PageResponse;
import com.dzj.vo.UserInfoVo;

/**
 * @author by dzj
 * @implNote 2021/10/20 9:04
 */
public interface UserService extends IService<User> {

    String register(RegisterDto registerDto);

    Boolean checkUsername(String username);

    String login(LoginDto loginDto);

    User getUserByUsername(String username);

    // 这里要reset cache 所以必须要有更新后的数据返回
    User updateUserInfo(UpdateUserInfoDto updateUserInfoDto);

    PageResponse<UserInfoVo> getUser(String loginName, String trueName, Integer pageNo, Integer pageSize);

    void handlerUser(Integer type, String userIds);

    void addUser(AddUserDto addUserDto);

    UserInfoVo getUserInfoById(Integer userId);
}
