package com.example.joseph.springbootintro.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by joseph on 9/3/17.
 * Email: developergitch@outlook.com
 */
@RestController
public class HomeController {
    @RequestMapping("/*")
    public String getHome(){
        return "Welcome to spring boot";
    }
}
