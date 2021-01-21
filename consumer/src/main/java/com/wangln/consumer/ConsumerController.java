package com.wangln.consumer;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.netflix.loadbalancer.DynamicServerListLoadBalancer;
import com.wangln.consumer.feign.FeignDemo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConsumerController
 * @Description 限流针对gateway做，熔断降级针对服务间的调用使用。
 * @Author liningwang
 * @Date 2020-10-04 11:56
 * @Version 1.0
 */
@RestController
@Slf4j
@RefreshScope
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private FeignDemo feignDemo;
    @Value("${test}")
    private String test;
    @GetMapping("/echo/appName")
    public String echoProviderName(){
        System.out.println(test);
        String url = "http://first-provider/helloK8s";
        String res = restTemplate.getForObject(url,String.class);
        log.info("res is {}",res);
        System.out.println("res " + res);
        return "consumer---config: " +test+" content:" + res;
    }

    @GetMapping("/echo/feign/appName")
    public String echoFeignName(){
        System.out.println(test);
        String res = feignDemo.echo();
        return "feign--consumer---config: " +test+" content:" + res;
    }
    @GetMapping("test/limit")
    @SentinelResource(value = "hello", blockHandler = "exceptionHandler", fallback = "helloFallback")
    public String testDegradeLimit(String test){
        //测试降级代码
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        if(test.equals("true")) {
//            throw new NullPointerException();
//        }
        return "pass degrade limit";
    }
    @GetMapping("test/flow/limit")
    @SentinelResource(value = "hello", blockHandler = "flowExceptionHandler", fallback = "flowHelloFallback")
    public String testFlowLimit(){
        return "pass flow limit";
    }

    /**
     * Fallback 函数，函数签名与原函数一致或加一个 Throwable 类型的参数.
     * 当被调用的方法产生错误的时候就会调用改方法，意思就是没有触发限流或降级，但是方法有异常，
     * 就会调用此方法。
     */
    public String helloFallback(String test) {
        return "fallback limit";
    }

    /**
     * Block 异常处理函数，参数最后多一个 BlockException，其余与原函数一致.
     * 限流或降级都会进入该方法，BlockException是降级异常和限流异常的父类。
     * 参考SentinelAutoConfiguration中的SentinelResourceAspect，他捕获到普通异常后
     * 会去进行统计工作。
     */
    public String exceptionHandler(String test,BlockException ex) {
        // Do some log here.
        ex.printStackTrace();
        return "Oops, exception limit";
    }
    public String flowExceptionHandler(BlockException ex) {
        // Do some log here.
        ex.printStackTrace();
        return "Oops, flow exception limit";
    }
    public String flowHelloFallback(String test) {
        return "fallback flow limit";
    }
}
