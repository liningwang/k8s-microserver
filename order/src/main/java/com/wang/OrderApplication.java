package com.wang;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName OrderApplication
 * @Description
 * @Author liningwang
 * @Date 2020-10-30 16:12
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients({"com.wang.feign"})
@MapperScan("com.wang.mapper")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
