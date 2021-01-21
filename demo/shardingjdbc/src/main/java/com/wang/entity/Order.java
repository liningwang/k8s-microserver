package com.wang.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName Order
 * @Description
 * @Author liningwang
 * @Date 2020-11-16 15:46
 * @Version 1.0
 */
@Data
@TableName("t_order")
public class Order {
    @TableField("order_id")
    private String orderId;
    @TableField("user_id")
    private String userId;
    @TableField("order_amount")
    private String orderAmount;
}
