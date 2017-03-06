package com.dap.controller;

import com.dap.model.Data;
import com.dap.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ME on 3/6/2017.
 */

@RestController
public class DataController {

    @Autowired
    private DataService dataService;

    @RequestMapping(value = "/test-message")
    public String dataMessage(){
        return "test Message";
    }
    @RequestMapping(method = RequestMethod.GET,value = "/data")
    public Map<String,Data> dataProducer(){
        System.out.println("Getting called!!");
        Map<String,Data> mapData=new HashMap<>();
        mapData.put("1",dataService.getLatestData().get(0));
        mapData.put("2",dataService.getLatestData().get(1));
        mapData.put("3",dataService.getLatestData().get(2));

        return mapData;
    }
}
