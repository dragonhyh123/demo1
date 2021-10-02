package com.example.demo.util;

public class User {
    private Long id;
    private String userName;

    public Long getId(){
        return this.id;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }
}
