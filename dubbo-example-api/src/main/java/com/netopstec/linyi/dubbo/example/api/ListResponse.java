package com.netopstec.linyi.dubbo.example.api;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *
 * @param <T>
 */
@Setter
@Getter
public class ListResponse<T> extends Response {

    private List<T> value;
}
