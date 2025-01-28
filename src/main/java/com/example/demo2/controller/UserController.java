package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo2.Service.UserService;
import com.example.demo2.domain.User;
import com.example.demo2.form.UserForm;

@Controller
@RequestMapping("/user")
public class UserController {
    

    @RequestMapping("")
    public String index(Model model){
            model.addAttribute("userForm", new UserForm()); // userForm をモデルに追加
        Map<Integer,String> hobbyMap = new LinkedHashMap<>();
        hobbyMap.put(1, "野球");
        hobbyMap.put(2, "サッカー");
        hobbyMap.put(3, "テニス");
        hobbyMap.put(4, "バレーボール");

        model.addAttribute("hobbyMap", hobbyMap);

        return "user/input";
    }

    @RequestMapping("/create")
    public String create(
        @Validated UserForm form,
         BindingResult bindingResult
        ,RedirectAttributes redirectAttributes
        ,Model model){

            if (bindingResult.hasErrors()) {
                return "user/input"; // バリデーションエラーがある場合、入力画面に戻る
        }
        
            User user = new User();
            BeanUtils.copyProperties(form, user);

            List<String> hobbyList=new ArrayList<>();
            for(Integer hobbyCode:form.getHobbyList()){
                switch (hobbyCode){

                    case 1:
                    hobbyList.add("野球");
                    break;
                    case 2:
                    hobbyList.add("サッカー");
                    break;
                    case 3:
                    hobbyList.add("テニス");
                    break;
                    case 4:
                    hobbyList.add("バレーボール");
                    break;
                }
            }

            user.setHobbyList(hobbyList);

            UserService userService = new UserService();
            user=userService.save(user);

            redirectAttributes.addFlashAttribute("user",user);

            return "redirect:/user/toresult";

        }


        @RequestMapping("/toresult")
        public String toresult(){
            return "user/result";
        }
    
}
