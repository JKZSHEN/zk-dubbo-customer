package com.jk.service.impl;

import com.jk.entity.User;
import com.jk.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @Author zhangZaiShen
 * @Description //TODO $
 * @Date $ $
 **/
@Service
public class UserServiceImpl implements UserService {
    @DubboReference(check = false)
    private UserService userService;

    @Override
    public int save(User user) {
        user = new User();
        user.setId(1);
        user.setAge(18);
        user.setSex("nv");
        user.setName("张as");
        user.setAddress("浙江省杭州市");
        userService.save(user);
        user = new User();
        user.setId(2);
        user.setAge(18);
        user.setSex("nv");
        user.setName("李as");
        user.setAddress("浙江省宁波市");
        userService.save(user);
        return 0;
    }

    @Override
    public User get(Integer id) {
        User user = userService.get(id);
        System.out.println(user.getName());
        return user;
    }
}
