package com.zoster.SimpleShoppingAPI.boot;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LogInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
            String ip = request.getHeader("X-FORWARDED-FOR");
            if (ip == null) {
                ip = request.getRemoteAddr();
            }
            MDC.put("ip", ip);
        } catch (Exception e) {
            MDC.clear();
        }
        return true;
    }
}
