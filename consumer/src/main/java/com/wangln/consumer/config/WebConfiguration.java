package com.wangln.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName WebConfigration
 * @Description
 * @Author liningwang
 * @Date 2020-10-16 15:05
 * @Version 1.0
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TokenInterceptor())
                .addPathPatterns("/**/**")
                .excludePathPatterns(getIncludePathPatterns());
    }
    /**
     * 需要用户和服务认证判断的路径
     *
     * @return
     */
    private ArrayList<String> getIncludePathPatterns() {
        ArrayList<String> list = new ArrayList<>();
        String[] urls = {
                "/gateLog/**",
                "/api/user/un/**"
        };
        Collections.addAll(list, urls);
        return list;
    }
}