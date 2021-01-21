package com.wang.controller;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.alibaba.nacos.client.naming.NacosNamingService;
import com.wang.entity.Order;
import com.wang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName OrderController
 * @Description
 * @Author liningwang
 * @Date 2020-10-30 16:14
 * @Version 1.0
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("create")
    public String createOrder(@RequestBody Order order) throws NacosException {
//        NacosNamingService nacosNamingService = new NacosNamingService("localhost");
//        List<String> list = new ArrayList<>();
//        list.add("default");
//        List<Instance> instances = nacosNamingService.getAllInstances("seata-server",list);
        orderService.create(order.getUserId(),order.getCommodityCode(),order.getCount());
        return "success";
    }
}
