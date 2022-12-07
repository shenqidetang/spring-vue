package com.tang.mapper;

import com.tang.entity.Jurisdictions;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author com.tang
 * @since 2022-11-25
 */
public interface JurisdictionsMapper extends BaseMapper<Jurisdictions> {

    @Select("select j.* from users u1,user_role u2,role_jurisdiction r1,jurisdictions j where u1.uid=u2.uid and u2.role_id=r1.role_id and r1.ju_id=j.ju_id and u1.username=#{name}")
    public List<Jurisdictions> selectByUserName(String name) ;

}
