package com.example.Repository;

import com.example.Domain.User;
import com.example.Domain.Focus;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

/**
 * Created by yusufjones on 3/28/16.
 */
public interface FocusRepository extends CrudRepository<Focus, Long> {
    ArrayList<Focus> findByUser(User user);

}