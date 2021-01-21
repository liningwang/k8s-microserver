package com.wang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName Order
 * @Description
 * @Author liningwang
 * @Date 2020-10-30 21:07
 * @Version 1.0
 */
@Data
@TableName("order_tbl")
public class Order {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField("user_id")
    private String userId;
    @TableField("commodity_code")
    private String commodityCode;
    private int count;
    private int money;
}
