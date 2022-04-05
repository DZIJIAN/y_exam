package com.dzj.Interceptor;

import com.dzj.utils.JwtUtils;
import com.dzj.vo.TokenVo;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * @author by dzj
 * @implNote 2021/10/22 10:55
 */
// 又属于老师又属于超级管理员和学生的拦截器
@Component
public class TeacherInterceptor implements HandlerInterceptor {

    // 这个方法是在访问接口之前执行的，我们只需要在这里写验证登陆状态的业务逻辑，就可以在用户调用指定接口之前验证登陆状态了
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 判断用户的token信息是否满足
        TokenVo tokenVo = JwtUtils.getUserInfoByToken(request);
        if (tokenVo != null && (Objects.equals(tokenVo.getRoleId(), 3) || Objects.equals(tokenVo.getRoleId(), 2)
                || Objects.equals(tokenVo.getRoleId(), 1))) {
            return true;
        }
        // 当前不满足条件,直接跳转拦截
        response.getWriter().print("Access denied");
        return false;
    }

}
