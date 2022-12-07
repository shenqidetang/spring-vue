package com.tang.service;

import com.tang.entity.Jurisdictions;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author com.tang
 * @since 2022-11-25
 */
public interface IJurisdictionsService extends IService<Jurisdictions> {
     List<Jurisdictions> selectByUserName(String  name) ;
}
