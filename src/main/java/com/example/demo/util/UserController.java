package com.example.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService = null;

    @RequestMapping("/print")
    @ResponseBody
    public User printUser(Long id, String userName, String note){
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        userService.printUser(user);
        return user;
    }

    @RequestMapping("/test")
    public String test(){
        return "Hello";
    }

    @RequestMapping("/vp")
    @ResponseBody
    public User validateAndPrint(Long id, String userName, String note){
        User user = new User();
        user.setId(id);
        user.setUserName(userName);

        UserValidator userValidator = (UserValidator) userService;
        if(userValidator.validate(user)){
            userService.printUser(user);
        }

        return user;
    }
}
