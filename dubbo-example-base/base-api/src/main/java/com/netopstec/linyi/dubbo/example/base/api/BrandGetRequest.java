package com.netopstec.linyi.dubbo.example.base.api;


import com.netopstec.linyi.dubbo.example.api.Request;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * created by 2019
 */
@Getter
@Setter
public class BrandGetRequest extends Request {

    @NotNull
    private Long id;
}
