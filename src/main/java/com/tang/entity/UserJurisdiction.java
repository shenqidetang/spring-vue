package com.tang.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("user_jurisdiction")
public class UserJurisdiction implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    @TableField(value = "ju_Id")
    private Integer juId;


}
