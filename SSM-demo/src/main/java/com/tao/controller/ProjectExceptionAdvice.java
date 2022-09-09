package com.tao.controller;

import com.tao.exception.BusinessException;
import com.tao.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//异常处理器
//@RestControllerAdvice
//public class ProjectExceptionAdvice {
//
//    @ExceptionHandler(SystemException.class)
//    public Result doSystemException(SystemException ex){
//        return new Result(ex.getCode(),ex.getMessage(),null);
//    }
//
//    @ExceptionHandler(BusinessException.class)
//    public Result doBusinessException(BusinessException ex){
//        return new Result(ex.getCode(),ex.getMessage(),null);
//    }
//
//    @ExceptionHandler(Exception.class)
//    public Result doException(Exception ex){
//        return new Result(666,"出异常啦",null);
//    }
//
//}
