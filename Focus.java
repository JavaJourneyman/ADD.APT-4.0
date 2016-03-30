package com.example.Domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by yusufjones on 3/28/16.
 */

@Entity
public class Focus {

    public Focus(){

    }

    public Focus(User user, com.example.Focus focus_level){
        setUser(user);
        setFocus_level(focus_level);
        setDate(new Date(System.currentTimeMillis()));
    }

    @NotNull
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name="userId")
    private User user;

    @NotNull
    private com.example.Focus focus_level;

    @NotNull
    private Date date;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public com.example.Focus getFocus_level() {
        return focus_level;
    }

    public void setFocus_level(com.example.Focus focus_level) {
        this.focus_level = focus_level;
    }

    public String getDate() {
        return date.toString();
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
