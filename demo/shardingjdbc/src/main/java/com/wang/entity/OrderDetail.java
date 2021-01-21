package com.wang.entity;

import lombok.Data;

/**
 * @ClassName OrderDetail
 * @Description
 * @Author liningwang
 * @Date 2020-11-18 17:39
 * @Version 1.0
 */
@Data
public class OrderDetail {
    private String orderAmount;
    private String orderId;
    private String itemName;
}
