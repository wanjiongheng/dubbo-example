package com.netopstec.linyi.dubbo.example.base.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class User {

    private Long id;

    private String number;

    private String name;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;
}
