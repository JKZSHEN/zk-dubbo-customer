package com.jk.controller;

import com.jk.entity.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangZaiShen
 * @Description //TODO $
 * @Date $ $
 **/
@RestController
@RequestMapping("us")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("save")
    public void save() {
        userService.save(new User());
    }
    @RequestMapping("get")
    public User get(Integer id) {
        return userService.get(id);
    }

}
