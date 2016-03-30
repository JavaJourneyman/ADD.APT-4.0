package com.example.Controller;

import com.example.Domain.Focus;
import com.example.Domain.User;
import com.example.Repository.FocusRepository;
import com.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by yusufjones on 3/28/16.
 */

@RestController
public class FocusController {
    @Autowired
    private FocusRepository focusRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/users/{user_id}/focus", method = RequestMethod.POST)
    public void createFocusRecord(@PathVariable("user_id") long userId, @RequestBody Focus focus){
        User user = userRepository.findOne(userId);

        if(user != null){
            Focus focusRecord = new Focus(user, focus.getFocus_level());
            focusRepository.save(focusRecord);
        }
    }
    @RequestMapping(value = "users/{user_id}/focus", method = RequestMethod.GET)
    public ArrayList<Focus> getUserFocusRecords(@PathVariable("user_id") long userId){
        User user = userRepository.findOne(userId);

        if(user != null){
            return focusRepository.findByUser(user);
        }
        return null;
    }
}
