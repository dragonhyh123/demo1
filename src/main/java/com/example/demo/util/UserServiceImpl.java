package com.example.demo.util;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void printUser(User user){
        if(user == null){
            throw new RuntimeException("Check user parameter is blank");
        }

        System.out.println("id="+user.getId());
        System.out.println("username="+user.getUserName());
    }
}
