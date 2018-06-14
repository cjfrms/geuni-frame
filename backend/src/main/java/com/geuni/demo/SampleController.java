package com.geuni.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/test")
    public String helloHtml() {
        return "index";
    }
}
