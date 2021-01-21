package com.wangln.consumer.config;

import com.wangln.consumer.feign.FeignDemoCallback;
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
    public FeignDemoCallback feignDemoCallback() {
        return new FeignDemoCallback();
    }
}
