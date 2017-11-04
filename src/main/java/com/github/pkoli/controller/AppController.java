package com.github.pkoli.controller;

import com.github.pkoli.service.AppServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private AppServiceI appServiceI;

    @GetMapping(value = "/request")
    public String getResource(){
         return appServiceI.getResource();
    }

}
