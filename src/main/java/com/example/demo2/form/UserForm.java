package com.example.demo2.form;

import java.util.ArrayList;
import java.util.List;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;



public class UserForm {
    
    @NotBlank(message="名前は必須です")
    private String name;
    @Size(min=1,max=127,message="Eメールは1文字以上127文字で入力してください")
    @Email(message="Eメールの形式が不正です")
    private String email;
    @Size(min=1,max=127,message="パスワードパスワードは1文字以上127文字で入力してください")
    private String pass;
    @NotEmpty(message="趣味は1つ以上選択してください")
    private List<Integer> hobbyList = new ArrayList<>(); 

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPass() {
        return pass;
    }
    public List<Integer> getHobbyList() {
        return hobbyList;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public void setHobbyList(List<Integer> hobbyList) {
        this.hobbyList = hobbyList;
    }

    

}
