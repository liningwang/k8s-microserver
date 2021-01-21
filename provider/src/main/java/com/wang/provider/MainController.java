package com.wang.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

/**
 * @ClassName MainController
 * @Description
 * @Author liningwang
 * @Date 2020-09-30 16:22
 * @Version 1.0
 */
@RestController
@Slf4j
@RefreshScope
public class MainController {

    @Value("${test}")
    private String test;

    @GetMapping("helloK8s")
    public String helloK8s(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String ip = getIp();
        System.out.println(test);
        return "provider--helloK8s test:"+test+" ip: "+ip;
    }
    private String getIp(){
        InetAddress ia=null;
        try {
            ia=InetAddress.getLocalHost();

            String localname=ia.getHostName();
            String localip=ia.getHostAddress();
            System.out.println("本机名称是："+ localname);
            System.out.println("本机的ip是 ："+localip);
            return localip;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "";
    }
}
