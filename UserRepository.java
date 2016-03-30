package com.example.Repository;

import com.example.Domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by yusufjones on 3/28/16.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
