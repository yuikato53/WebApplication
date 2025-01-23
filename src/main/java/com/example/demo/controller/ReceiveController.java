package com.example.demo.controller;

import javax.sound.midi.Receiver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.ReceiveForm;

@Controller
@RequestMapping("/receive")
public class ReceiveController {

    @ModelAttribute
    public ReceiveForm setUpForm(){
        return new ReceiveForm();
    }

    @RequestMapping("")
    public String hoge(){
        return "info-form";
    }

    @RequestMapping("/receive-info")
    public String recieveInfo(ReceiveForm receiveForm){
    // (String name, String age){
        System.out.println(receiveForm.getName());
        System.out.println(receiveForm.getAge());

        return "finished";
    }

}
