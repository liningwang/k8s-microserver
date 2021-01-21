package com.wang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName AccountApplication
 * @Description
 * @Author liningwang
 * @Date 2020-10-30 14:11
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.wang.mapper")
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class,args);
    }
}
