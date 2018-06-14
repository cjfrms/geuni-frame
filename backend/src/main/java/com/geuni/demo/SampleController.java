package com.geuni.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SampleController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/index")
    public String helloHtml(Model model) {
        Map<String,String> map = new HashMap<>();
        map.put("title","aa");
        Map<String,String>  map1 = new HashMap<>();
        map1.put("title","bb");
        Map<String,String>  map2 = new HashMap<>();
        map2.put("title","cc");
        List<Map<String,String>> list= new ArrayList<>();
        list.add(map);
        list.add(map1);
        list.add(map2);
        model.addAttribute("listmap",list);
        return "index";
    }
}
