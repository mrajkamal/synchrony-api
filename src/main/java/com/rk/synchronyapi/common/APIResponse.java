package com.rk.synchronyapi.common;


import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class APIResponse {

    private Integer status;
    private Object data;
    private Object error;

    public APIResponse() {
        this.status = HttpStatus.OK.value();
        this.data = data;
        this.error = error;
    }



}
