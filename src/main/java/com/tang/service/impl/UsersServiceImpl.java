package com.tang.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tang.entity.RoleJurisdiction;
import com.tang.entity.Roles;
import com.tang.entity.UserRole;
import com.tang.entity.Users;
import com.tang.mapper.RoleJurisdictionMapper;
import com.tang.mapper.RolesMapper;
import com.tang.mapper.UserRoleMapper;
import com.tang.mapper.UsersMapper;
import com.tang.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author com.tang
 * @since 2022-11-25
 */
@Service
public class UsersServiceImpl implements UserDetailsService {
    @Autowired
    private PasswordEncoder encoder;

    @Autowired(required = false)
    private UsersMapper usersMapper;

    @Autowired(required = false)
    private RolesMapper rolesMapper;

    @Autowired(required = false)
    private UserRoleMapper userRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<Users> queryWrapper = new QueryWrapper<>();
        //查询名字为 Tom 的一条记录
        queryWrapper.eq("username",username);
        Users user = usersMapper.selectOne(queryWrapper);

//
//        //查用户角色绑定
//        QueryWrapper<UserRole> queryWrapper1 = new QueryWrapper<>();
//        queryWrapper.eq("uid",users.getUid());
//        UserRole userRole = userRoleMapper.selectOne(queryWrapper1);
//
//        //角色表
//        QueryWrapper<Roles> queryWrapper2 = new QueryWrapper<>();
//        queryWrapper2.eq("role_id",userRole.getRoleId());
//        Roles roles=rolesMapper.selectOne(queryWrapper2);

//        if(!username.equals("admin")){
//            throw new UsernameNotFoundException("用户名不存在");
//        }
//        把查询出来的密码进行解析,或直接把password放到构造方法中。
//        理解:password就是数据库中查询出来的密码，查询出来的内容不是123
//        String password = encoder.encode("123");
        System.out.printf("ss"+user);
        return new User(username,encoder.encode(user.getPassword()), AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
