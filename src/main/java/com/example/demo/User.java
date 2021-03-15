package com.example.demo;

import org.apache.kafka.common.protocol.types.Field;

public class User {
    private int userId;
    private String firstName;
    private String lastName;


    public void User(int userId, String firstName, String lastname){
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastname;
    }

    public int getUserId(){
        return userId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

}
