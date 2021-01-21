package com.wang.service;

/**
 * @ClassName OrderService
 * @Description
 * @Author liningwang
 * @Date 2020-10-30 16:58
 * @Version 1.0
 */
public interface OrderService {
    void create(String userId, String commodityCode, int orderCount);
}
