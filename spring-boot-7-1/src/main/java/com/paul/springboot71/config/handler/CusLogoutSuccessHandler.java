package com.paul.springboot71.config.handler;

import com.alibaba.fastjson.JSON;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 登出成功
 *
 * @author jinzhm
 * @date 2020/12/5 13:28
 */
@Component
public class CusLogoutSuccessHandler implements LogoutSuccessHandler {

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("code", "000");
        retMap.put("message", "登出成功");
        response.getWriter().write(JSON.toJSONString(retMap));
    }
}
