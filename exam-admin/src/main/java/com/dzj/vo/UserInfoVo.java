package com.dzj.vo;

import com.dzj.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoVo {

    private Integer id;

    private String username;

    private String trueName;

    private Integer roleId;

    private Integer status;

    private Date createDate;

    public static UserInfoVo fromUser(User user) {
        /*
        * 优化返回user为null，导致的BeanUtils.copyProperties异常报错
        * */
        UserInfoVo userInfoVo = new UserInfoVo();
        if(user != null){
           BeanUtils.copyProperties(user, userInfoVo);
        }
        return userInfoVo;
    }
}
