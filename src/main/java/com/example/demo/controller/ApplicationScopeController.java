package com.example.demo.controller;
//Applicationscpoeは他のブラウザと共有される

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/application-scop")

public class ApplicationScopeController {

    @Autowired
    private ServletContext aplication;

    @RequestMapping("")
    public String index(){
        //既に値が入っていないか
        Integer counter = (Integer)aplication.getAttribute("counter");
        if(counter==null){
            aplication.setAttribute("counter", 1);
        } else{
            counter ++;
            aplication.setAttribute("counter", counter);
        }

        // aplication.setAttribute("hoge", 10);
        return "application-scop";
    }


}
