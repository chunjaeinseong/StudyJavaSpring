package com.chunjae.chunjaefaq.controller;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String DefaultMain() {
        return "sample";
    } 

    @GetMapping("/get")
    public String Get() {
        return "gettest";
    } 
}
