package com.wang.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("order_item")
public class OrderItem {
    @TableField("order_id")
    private String orderId;
    @TableField("item_name")
    private String itemName;
    @TableId("id")
    private Long id;
}
