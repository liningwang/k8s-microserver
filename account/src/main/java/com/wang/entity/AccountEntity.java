package com.wang.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName AccountEntity
 * @Description
 * @Author liningwang
 * @Date 2020-10-30 14:13
 * @Version 1.0
 */
@Data
@TableName("account_tbl")
public class AccountEntity {
    private Long id;
    @TableField("user_id")
    private String userId;
    private int money;
}
