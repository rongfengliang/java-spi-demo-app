package com.spiapp;

import com.dalong.ServiceProvider;
import com.dalongspi.UserLogin;

public class Application {
    public  static void main(String[] args){
       UserLogin login = ServiceProvider.getLoadUserLoginService();
       String result = login.token("dalong","app");
        System.out.println(result);
    }
}
