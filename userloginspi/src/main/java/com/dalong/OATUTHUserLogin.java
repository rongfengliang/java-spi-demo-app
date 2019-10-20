package com.dalong;

import com.dalongspi.UserLogin;
import com.google.auto.service.AutoService;

/**
 * @author dalong
 */
@AutoService(UserLogin.class)
public class OATUTHUserLogin implements  UserLogin {
    @Override
    public String token(String name, String password) {
        return "OATUTHUserLogin";
    }
}
