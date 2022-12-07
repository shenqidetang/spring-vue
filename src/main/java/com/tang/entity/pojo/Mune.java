package com.tang.entity.pojo;

import com.tang.entity.Jurisdictions;
import lombok.Data;

import java.util.List;

@Data
public class Mune {
    private Integer id;

    private String label;

    private String nodeurl;

    private List<Mune> children;


}
