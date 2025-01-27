package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/chat")
public class Ex16Controller {

    private List<String> messages = new ArrayList<>();

    @RequestMapping("")
    public String index(Model model){
        model.addAttribute("messages",messages);
        return "ex-16";
    }

    @RequestMapping("/message")
    public String sendMessages()



}
