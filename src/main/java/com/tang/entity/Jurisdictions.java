package com.tang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author com.tang
 * @since 2022-11-25
 */

@Data
public class Jurisdictions implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ju_id", type = IdType.AUTO)
    private Integer juId;

    private String juName;

    @TableField(value = "route_url")
    private String  routeurl;
}
