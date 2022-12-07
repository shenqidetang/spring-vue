package com.tang.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tang.entity.Users;
import com.tang.service.impl.UsersServiceImpl;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author com.tang
 * @since 2022-11-25
 */
@RestController
@RequestMapping
//@CrossOrigin
public class UsersController {

    @Autowired
    public UsersServiceImpl usersServiceimpl;

    @RequestMapping("/login")
    public Boolean login(Users users){
        System.out.printf("123"+ users);
        return  true;
    }

    @RequestMapping("/admin")
    public Boolean admin(){
        return  true;
    }
}
