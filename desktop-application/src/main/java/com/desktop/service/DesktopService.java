package com.desktop.service;

import com.desktop.feign.DesktopDataService;
import com.desktop.model.Data;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by ME on 3/6/2017.
 */
@Service
public class DesktopService {

    @Autowired
    private DesktopDataService desktopDataService;

    @Autowired
    private DiscoveryClient discoveryClient;



    @HystrixCommand(fallbackMethod ="getLatestDataFallback")
    public Map<String,Data> getLatestData(){
       /* List<ServiceInstance> serviceInstances=discoveryClient.getInstances("DATA-PRODUCER-SERVICE");
        for(ServiceInstance i:serviceInstances){
            System.out.println("host="+i.getHost());
            System.out.println("port="+i.getPort());

        }*/
        Map<String,Data> dataMap=desktopDataService.getLatestDataFromRemoteServer();
       return desktopDataService.getLatestDataFromRemoteServer();
    }

    public Map<String,Data> getLatestDataFallback(){
        Data outageData=new Data("000","Outage");
        return Collections.singletonMap("OUTAGE",outageData);
    }

}
