package com.metahorizon.user.service;

import com.metahorizon.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Asus on 5/16/2018.
 */
public interface UserService {

    List<User> getUser();

    User getUserById(int id);

    void deleteUser(int id);


}
