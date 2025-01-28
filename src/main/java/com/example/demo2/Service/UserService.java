package com.example.demo2.Service;

import com.example.demo2.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User save (User user){
        //引数で受け取ったUser情報を
        //Usersテーブルにインサート
        //hobbysテーブルにインサート
        //メール送信
        System.out.println("UserServiceのsaveが呼ばれました");

        return user;
    }


}              
