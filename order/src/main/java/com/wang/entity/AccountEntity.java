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
public class AccountEntity {
    private String userId;
    private int money;
}
