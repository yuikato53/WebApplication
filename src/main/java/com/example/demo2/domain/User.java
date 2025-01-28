package com.example.demo2.domain;

import java.util.List;

public class User {

    private Integer id;
    private String name;
    private String email;
    private String pass;
    private List<String> hobbyList;

    
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPass() {
        return pass;
    }
    public List<String> getHobbyList() {
        return hobbyList;
    }
    public void setId(Integer id) {
        this.id = id;
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
    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    

}
