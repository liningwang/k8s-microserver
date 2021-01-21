package com.wang.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.entity.Order;
import com.wang.entity.OrderDetail;
import com.wang.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName OrderService
 * @Description
 * @Author liningwang
 * @Date 2020-11-16 15:50
 * @Version 1.0
 */
@Service
public class OrderService extends ServiceImpl<OrderMapper, Order> {
    @Autowired
    private OrderMapper orderMapper;

    public OrderDetail getOrderDetail(String orderId,String userId){
        return orderMapper.getOrderDetail(orderId,userId);
    }
}
