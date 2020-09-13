package com.itclj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itclj")
public class ItcljController {

    @Value("${itclj.param1}")
    private String parma1;

    @Value("${itclj.param2}")
    private String param2;

    @GetMapping("/param1")
    public String getParma1(){
        return parma1;
    }

    @GetMapping("/param2")
    public String getParam2(){
        return param2;
    }
}
