package com.example.demo.util;

public class UserValidatorImpl implements UserValidator{
    @Override
    public boolean validate(User user){
        System.out.println("introduce new interface "+UserValidator.class.getSimpleName());
        return user!=null;
    }
}
