package com.tang.service.impl;

import com.tang.entity.Jurisdictions;
import com.tang.mapper.JurisdictionsMapper;
import com.tang.service.IJurisdictionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author com.tang
 * @since 2022-11-25
 */
@Service
public class JurisdictionsServiceImpl extends ServiceImpl<JurisdictionsMapper, Jurisdictions> implements IJurisdictionsService {

    @Autowired(required = false)
    JurisdictionsMapper jurisdictionsMapper;

    @Override
    public List<Jurisdictions> selectByUserName(String name) {
        return jurisdictionsMapper.selectByUserName(name);
    }


}
