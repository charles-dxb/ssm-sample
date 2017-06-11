package com.test.firstapp.service;

import com.test.firstapp.model.User;

import java.util.List;

/**
 * Created by charles on 2017/6/11.
 */
public interface UserService {

    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);

    User getUserByName(String userName);
}
