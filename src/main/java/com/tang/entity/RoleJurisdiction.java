package com.tang.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("role_jurisdiction")
public class RoleJurisdiction implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "role_Id")
    private Integer roleId;

    @TableField(value = "ju_Id")
    private Integer juId;


}
