package com.hfwang.servicebase.exceptionhandler;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                  // get set 方法
@AllArgsConstructor // 有参数构造方法
@NoArgsConstructor // 无参数构造
public class MyExpection extends RuntimeException{

    @ApiModelProperty(value = "状态码")
    private Integer code;

    private String msg;

}
