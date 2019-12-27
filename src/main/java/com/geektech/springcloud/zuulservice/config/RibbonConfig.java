package com.geektech.springcloud.zuulservice.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RibbonConfig {
    @Bean
    public IRule ribbonRule(){
        return new RoundRobinRule();
    }
}
