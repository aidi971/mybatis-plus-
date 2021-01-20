package com.eddie.mybatisplusmul.response;

import lombok.Data;

/**
 * @Author: eddie
 * @Date: 2021/1/20 14:20
 **/
@Data
public class Response {
    private int status;
    private String msg;
    private Object object;

    public Response(int status, String msg, Object object){
        this.status = status;
        this.msg = msg;
        this.object = object;
    }
}
