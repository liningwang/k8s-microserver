package com.wang.feign;

import com.wang.entity.AccountEntity;

/**
 * @ClassName AccountFallback
 * @Description
 * @Author liningwang
 * @Date 2020-10-30 21:28
 * @Version 1.0
 */
public class AccountFallback implements AccountService {
    @Override
    public String debit(AccountEntity accountEntity) {
        return "debit failed";
    }
}
