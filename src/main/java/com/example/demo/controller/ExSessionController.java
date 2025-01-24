package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exsession")
public class ExSessionController {
    @Autowired
   private HttpSession exsession;
    

    @RequestMapping("")
    public String index(){
        return "Ex-session";
    }

    @RequestMapping("/exsession-log")
    public String inputLog(String adress, String pass){
        if ("test@example.com".equals(adress) && "123".equals(pass)) {
        exsession.setAttribute("hoge", adress );
        exsession.setAttribute("fuga", pass);
        // exsession.setAttribute("fuga",pass );
    
       return "exsession-result";}
        
       else{return "Ex-session" ; }

        }

    @RequestMapping("/to-page2")
    public String toPage2(){
    return "exsession-result2";}


}
