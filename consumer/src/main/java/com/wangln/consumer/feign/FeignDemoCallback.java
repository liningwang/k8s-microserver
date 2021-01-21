package com.wangln.consumer.feign;

/**
 * @ClassName FeignDemoCallback
 * @Description
 * @Author liningwang
 * @Date 2020-10-27 14:03
 * @Version 1.0
 */
public class FeignDemoCallback implements FeignDemo {
    @Override
    public String echo() {
        return "feign failed";
    }
}
