package com.tang.controller;

import com.tang.entity.Roles;
import com.tang.mapper.RolesMapper;
import com.tang.service.impl.RolesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author com.tang
 * @since 2022-11-25
 */
@RestController
@RequestMapping("/roles")
public class RolesController {

    @Autowired
    RolesServiceImpl rolesService;

    @RequestMapping("/role/list")
    public List<Roles> list(){
       return rolesService.list();
    }
}
