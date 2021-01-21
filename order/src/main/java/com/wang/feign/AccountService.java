package com.wang.feign;

import com.wang.config.FeignConfiguration;
import com.wang.entity.AccountEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @ClassName AccountService
 * @Description
 * @Author liningwang
 * @Date 2020-10-30 21:26
 * @Version 1.0
 */
@FeignClient(name="account",fallback = AccountFallback.class, configuration = FeignConfiguration.class)
public interface AccountService {
    @PostMapping("/debit")
    String debit(@RequestBody AccountEntity accountEntity);
}
