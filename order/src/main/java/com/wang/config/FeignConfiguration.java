package com.wang.config;

import com.wang.feign.AccountFallback;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName FeignConfiguration
 * @Description
 * @Author liningwang
 * @Date 2020-10-27 14:04
 * @Version 1.0
 */
public class FeignConfiguration {
    @Bean
    public AccountFallback feignDemoCallback() {
        return new AccountFallback();
    }
}
