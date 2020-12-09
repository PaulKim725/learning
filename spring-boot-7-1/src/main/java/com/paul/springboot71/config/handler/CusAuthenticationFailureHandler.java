package com.paul.springboot71.config.handler;

import com.alibaba.fastjson.JSON;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 登录失败
 *
 * @author jinzhm
 * @date 2020/12/5 13:33
 */
@Component
public class CusAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        if (e instanceof BadCredentialsException) {
            Map<String, Object> retMap = new HashMap<>();
            retMap.put("code", "001");
            retMap.put("message", "用户名或密码错误");
            response.getWriter().write(JSON.toJSONString(retMap));
        } else {
            response.getWriter().write(JSON.toJSONString(e.getMessage()));
        }
    }
}
