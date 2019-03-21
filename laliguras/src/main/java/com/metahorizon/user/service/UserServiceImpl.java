package com.metahorizon.user.service;


import com.metahorizon.user.entity.User;
import com.metahorizon.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Asus on 5/17/2018.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getOne(id);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
