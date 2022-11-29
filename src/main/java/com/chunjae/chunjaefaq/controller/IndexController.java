package com.chunjae.chunjaefaq.controller;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String DefaultMain() {
        return "sample";
    } 

    @GetMapping("/get")
    public String Get(HttpServletRequest request) {
        request.setAttribute("intdata", 100);
		request.setAttribute("stringdata", "string");
        return "gettest";
    } 
}
