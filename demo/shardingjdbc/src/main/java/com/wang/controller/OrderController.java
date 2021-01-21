package com.wang.controller;

import com.wang.entity.Order;
import com.wang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description
 * @Author liningwang
 * @Date 2020-11-16 15:51
 * @Version 1.0
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("createOrder")
    public Object createOrder(@RequestBody Order order){
        orderService.save(order);
        return "success";
    }
}
