package com.wangln.consumer.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName TokenInteruptor
 * @Description
 * @Author liningwang
 * @Date 2020-10-16 15:08
 * @Version 1.0
 */
@Slf4j
public class TokenInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String test = request.getHeader("test");
        log.info("interceptor " + test);
        return super.preHandle(request, response, handler);
    }
}
