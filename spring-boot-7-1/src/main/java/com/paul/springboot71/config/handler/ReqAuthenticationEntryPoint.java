package com.paul.springboot71.config.handler;

import com.alibaba.fastjson.JSON;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 请求未登录时处理结果
 *
 * @author jinzhm
 * @date 2020/12/5 10:23
 */
@Component
public class ReqAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("code", "401");
        retMap.put("message", "用户未登录");
        response.getWriter().write(JSON.toJSONString(retMap));
    }
}
