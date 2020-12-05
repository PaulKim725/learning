package com.paul.springboot71.config.handler;

import com.alibaba.fastjson.JSON;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 登录陈宫
 *
 * @author jinzhm
 * @date 2020/12/5 13:30
 */
@Component
public class CusAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("code", "000");
        retMap.put("message", "登录成功");
        response.getWriter().write(JSON.toJSONString(retMap));
    }
}
