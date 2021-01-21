package com.wang.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.wang.entity.AccountEntity;
import com.wang.mapper.AccountMapper;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @ClassName AccountServiceImpl
 * @Description
 * @Author liningwang
 * @Date 2020-10-30 13:40
 * @Version 1.0
 */
@Slf4j
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    public void debitDefault(String userId, int money) {
        log.info("debit");
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setMoney(money);
        UpdateWrapper<AccountEntity> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("user_id",userId);
        accountMapper.update(accountEntity,updateWrapper);
    }
    @Override
    public void debit(String userId, int money){
        accountMapper.debit(userId,money);
    }
}
