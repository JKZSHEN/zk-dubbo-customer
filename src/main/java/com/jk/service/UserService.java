package com.jk.service;

import com.jk.entity.User;

public interface UserService {
    int save(User user);

    User get(Integer id);
}
