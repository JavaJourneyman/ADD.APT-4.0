package com.example.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by yusufjones on 3/28/16.
 */

@Entity
public class User {

    public User(){

    }

    public User(String userName){
        setUserName(userName);
    }

    @NotNull
    @Id
    @GeneratedValue
    private long userId;

    @NotNull
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
