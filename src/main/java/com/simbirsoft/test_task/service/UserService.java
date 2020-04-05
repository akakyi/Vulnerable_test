package com.simbirsoft.test_task.service;

import com.simbirsoft.test_task.db.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User getById(Integer id);

    User save(User user);

}
