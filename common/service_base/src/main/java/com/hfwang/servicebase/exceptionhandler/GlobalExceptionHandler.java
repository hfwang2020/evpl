package com.hfwang.servicebase.exceptionhandler;


import com.hfwang.commonutils.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
        e.printStackTrace();
        return R.error().message("全局异常");
    }

    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public R error(ArithmeticException e){
        e.printStackTrace();
        return R.error().message("ArithmeticException异常");
    }

    @ExceptionHandler(MyExpection.class)
    @ResponseBody
    public R error(MyExpection e){
        e.printStackTrace();
        return R.error().message(e.getMessage()).code(e.getCode());
    }

}
