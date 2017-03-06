package com.mobile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ME on 3/6/2017.
 */
@RestController
public class Mobile {

    @RequestMapping("/mobile")
    public String mobileApp(){
        return "Mobile app working!!";
    }
}
