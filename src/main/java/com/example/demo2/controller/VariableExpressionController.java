package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.Car;

@Controller
@RequestMapping("")

public class VariableExpressionController {

    @RequestMapping("")
    public String index(Model model){
        model.addAttribute("name","加藤");

        Car car = new Car(100,"プリウス",50);
        model.addAttribute("car",car);

        return "variable-expressions";
    }

}
