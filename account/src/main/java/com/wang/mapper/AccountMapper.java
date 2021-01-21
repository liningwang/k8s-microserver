package com.wang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wang.entity.AccountEntity;
import org.apache.ibatis.annotations.Update;

/**
 * @ClassName AccountMapper
 * @Description
 * @Author liningwang
 * @Date 2020-10-30 14:11
 * @Version 1.0
 */
public interface AccountMapper extends BaseMapper<AccountEntity> {
    @Update("update account_tbl set money = money - #{money} where user_id = #{userId}")
    public void debit(String userId,int money);
}
