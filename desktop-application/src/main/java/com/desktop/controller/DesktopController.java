package com.desktop.controller;

import com.desktop.model.Data;
import com.desktop.service.DesktopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by ME on 3/6/2017.
 */

@RestController
public class DesktopController {

    @Autowired
    private DesktopService desktopService;

    @RequestMapping("/desktop-data")
    public Map<String,Data> desktopApp(){
        return desktopService.getLatestData();
    }


}
