package com.netopstec.linyi.dubbo.example.base.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Brand {

    private Long id;

    private String name;

    private String storeUrl;

    private String memo;

    private Date createTime;

    private Long createUser;

    private Date updateTime;

    private Long updateUser;

    private Date deleteTime;

    private Integer isDelete;

}
