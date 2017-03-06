package com.desktop.feign;

import com.desktop.model.Data;
import com.desktop.service.DesktopService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by ME on 3/6/2017.
 */

@FeignClient(name = "DATA-PRODUCER-SERVICE")
public interface DesktopDataService {

    @RequestMapping(method = RequestMethod.GET,value ="/data")
    public Map<String,Data> getLatestDataFromRemoteServer();
}
