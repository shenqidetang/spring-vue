package com.tang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalTime;

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
public class Record implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "rd_id", type = IdType.AUTO)
    private Integer rdId;

    @TableField(value = "rd_Sql")
    private String rdSql;

    private Integer uid;

    @TableField(value = "role_Id")
    private Integer roleId;

    @TableField(value = "rd_Time")
    private LocalTime rdTime;


}
