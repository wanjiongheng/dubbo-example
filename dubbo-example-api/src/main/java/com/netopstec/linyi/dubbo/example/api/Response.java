package com.netopstec.linyi.dubbo.example.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * created by 2019
 */
@Getter
@Setter
@NoArgsConstructor
public class Response{

    private String errorCode;

    private String errorMsg;

    public Response(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return errorMsg == null && errorCode == null;
    }
}
