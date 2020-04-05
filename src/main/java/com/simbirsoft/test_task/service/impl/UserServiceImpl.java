package com.simbirsoft.test_task.service.impl;

import com.simbirsoft.test_task.db.entity.User;
import com.simbirsoft.test_task.db.repository.UserRepository;
import com.simbirsoft.test_task.dto.security.UserSecurity;
import com.simbirsoft.test_task.service.UserService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getById(@NonNull Integer id) {
        Optional<User> user = this.userRepository.findById(id);

        return user.orElse(null);
    }

    @Override
    public User save(User user) {
        User saved = this.userRepository.save(user);

        return saved;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> user = this.userRepository.findByLogin(s);
        User dbUser = user.orElseThrow(() -> new UsernameNotFoundException(s));
        UserSecurity userSecurity = new UserSecurity(dbUser);

        return userSecurity;
    }
}
