package com.wang.controller;

import com.wang.entity.AccountEntity;
import com.wang.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName controller
 * @Description
 * @Author liningwang
 * @Date 2020-10-30 13:39
 * @Version 1.0
 */
@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/debit")
    public String debit(@RequestBody AccountEntity account){
        accountService.debit(account.getUserId(),account.getMoney());
        return "success";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
