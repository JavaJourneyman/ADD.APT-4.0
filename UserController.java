package com.example.Controller;

import com.example.Domain.User;
import com.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yusufjones on 3/28/16.
 */

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/users" , method = RequestMethod.POST)
    public void createUser(@RequestBody User user){
        //This saves the user to the Database
        userRepository.save(user);

    }

    @RequestMapping(value = "/users/{user_id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("user_id") long userId){
        return userRepository.findOne(userId);
    }//This gets the user to the Database

}
