package com.netopstec.linyi.dubbo.example.api;

import lombok.Getter;
import lombok.Setter;

/**
 * created by 2019
 */
@Getter
@Setter
public class ObjectResponse<T> extends Response {

    private T value;
}
