package com.wangln.consumer.feign;

import com.wangln.consumer.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName FeignDemo
 * @Description
 * @Author liningwang
 * @Date 2020-10-27 13:57
 * @Version 1.0
 */
@FeignClient(name = "first-provider", fallback = FeignDemoCallback.class, configuration = FeignConfiguration.class)
public interface FeignDemo {
    @GetMapping(value = "/helloK8s")
    String echo();
}

