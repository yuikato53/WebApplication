package com.example.demo.form;

public class ReceiveForm {

    private String name;
    private String age;  //カプセル化→getter/setter

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "ReceiveForm[name="+name+",age="+age+"]";
    }



}
