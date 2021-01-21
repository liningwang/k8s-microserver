package com.wangln.consumer.config;

import com.alibaba.cloud.circuitbreaker.sentinel.SentinelCircuitBreakerFactory;
import com.alibaba.cloud.circuitbreaker.sentinel.SentinelConfigBuilder;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.List;

/**
 * @ClassName SentinelConfig
 * @Description
 * @Author liningwang
 * @Date 2020-10-28 14:10
 * @Version 1.0
 */
@Configuration
public class SentinelConfig {
//    @Bean
//    public Customizer<SentinelCircuitBreakerFactory> slowCustomizer() {
//        String slowId = "slow";
//        List<DegradeRule> rules = Collections.singletonList(
//                new DegradeRule(slowId).setGrade(RuleConstant.DEGRADE_GRADE_RT)
//                        .setCount(100)
//                        .setTimeWindow(10)
//        );
//        return factory -> factory.configure(builder -> builder.rules(rules), slowId);
//    }
//    @Bean
//    public Customizer<SentinelCircuitBreakerFactory> defaultCustomizer() {
//        return factory -> factory.configureDefault(id -> new SentinelConfigBuilder(id)
//                .build());
//    }
}
