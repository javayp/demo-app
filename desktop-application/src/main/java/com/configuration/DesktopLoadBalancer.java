package com.configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by ME on 3/6/2017.
 */
@Configuration
public class DesktopLoadBalancer {

    @Autowired
   IClientConfig ribbonClientConfig;

    @Bean
   public IPing ribbonPing(IClientConfig config){
       return new PingUrl();
   }
    @Bean
   public IRule ribbonRule(IClientConfig config){
       return new WeightedResponseTimeRule();
   }
}
