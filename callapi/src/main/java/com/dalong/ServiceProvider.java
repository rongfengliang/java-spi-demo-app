package com.dalong;

import com.dalongspi.UserLogin;

import java.util.ServiceLoader;
import java.util.stream.StreamSupport;

public class ServiceProvider {
    /**
     *  return  login service with first one
     * @return UserLogin  login service with first one
     */
    public  static UserLogin getLoadUserLoginService(){
        ServiceLoader<UserLogin> loader = ServiceLoader.load(UserLogin.class);
        UserLogin loginService = StreamSupport.stream(loader.spliterator(), false)
                .filter(p -> p.getClass().getSimpleName().equals("PlatformLogin"))
                .findFirst()
                .get();
        return loginService;
    }
}
