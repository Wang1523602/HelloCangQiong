package com.sky.aotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 自定义注解，实现自动填充功能
 */
@Target(ElementType.METHOD)      // 注解所修饰的对象范围,ElementType.METHOD表示该注解只能用于方法
@Retention(RetentionPolicy.RUNTIME)    // 运行时生效
public @interface AutoFill {
    //数据库操作类型：UPDATE INSERT
    OperationType value();
}
