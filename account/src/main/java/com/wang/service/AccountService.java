package com.wang.service;

/**
 * @ClassName AccountService
 * @Description
 * @Author liningwang
 * @Date 2020-10-30 13:40
 * @Version 1.0
 */
public interface AccountService {
    void debit(String userId, int money);
}
