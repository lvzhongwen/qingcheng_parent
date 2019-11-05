package com.qingcheng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Result implements Serializable {

    private Integer code;//业务返回码  0：成功  1:错误

    private String message;//消息

    public Result() {
        this.code=0;
        this.message="执行成功";
    }

}
