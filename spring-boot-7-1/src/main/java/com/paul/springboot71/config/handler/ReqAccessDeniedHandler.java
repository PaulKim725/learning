package com.paul.springboot71.config.handler;

import com.alibaba.fastjson.JSON;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 无权限返回处理
 *
 * @author jinzhm
 * @date 2020/12/5 13:26
 */
@Component
public class ReqAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("code", "403");
        retMap.put("message", "没有相关权限");
        response.getWriter().write(JSON.toJSONString(retMap));
    }
}
