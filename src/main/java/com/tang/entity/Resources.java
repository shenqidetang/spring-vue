package com.tang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class Resources implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "rs_id", type = IdType.AUTO)
    private Integer rsId;

    private String icon;

    private String text;


}
