package com.netopstec.linyi.dubbo.example.api;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * created by 2019
 */
@Getter
@Setter
public class Request {

    /**
     * 时间戳
     */
    @NotNull
    private Long timestamp;

    /**
     * user 工号
     */
    @NotNull
    private String member;

}
