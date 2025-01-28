package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.User2;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/chat")
public class Ex16Controller {
    @Autowired
    private ServletContext application;

    // private List<String> messages = new ArrayList<>();

    @RequestMapping("")
    public String index(){
        @SuppressWarnings("unchecked")
        List<User2> userList=(List<User2>)
        application.getAttribute("userList");
        if(userList==null){
            userList=new ArrayList<>();
            application.setAttribute("userList",userList);
        }
        
        // model.addAttribute("messages",messages);
        return "ex-16";
    }

    @RequestMapping("/post")
    public String post(String name,String comment){
        @SuppressWarnings("unchecked")
        List<User2> userList= (List<User2>)
        application.getAttribute("userList");
        userList.add(0,new User2(name,comment));
        return "ex-16";

    }



}
