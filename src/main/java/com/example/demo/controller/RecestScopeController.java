package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/requestScope")
public class RecestScopeController {
    
    @RequestMapping("")
    public String hogehoge(){
        return "request-scope-form";
    }

    @RequestMapping("input")
    public String input(String name, Model model){
        model.addAttribute("hogehoge",model);  //hogehogeがキー
        return "result-request-scope";
    }
}
