package com.wang.service;

import com.wang.entity.AccountEntity;
import com.wang.entity.Order;
import com.wang.feign.AccountService;
import com.wang.mapper.OrderMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName OrderServiceImpl
 * @Description
 * @Author liningwang
 * @Date 2020-10-30 16:58
 * @Version 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private AccountService accountService;
    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public void create(String userId, String commodityCode, int orderCount) {
        int money = orderCount * 5;

        AccountEntity account = new AccountEntity();
        account.setMoney(money);
        account.setUserId(userId);
        accountService.debit(account);

        Order order = new Order();
        order.setUserId(userId);
        order.setCommodityCode(commodityCode);
        order.setMoney(money);
        int a = 1 / 0;
        orderMapper.insert(order);
    }
}
