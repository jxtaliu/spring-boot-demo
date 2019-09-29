package com.example.lambda;

/**
 * Lambda 语法：
 * (parameters) -> expression
 * (parameters) -> {statements;}
 *
 * parameters:形参列表
 * ->：被用于
 * 方法体：可以用表达式，或者代码块
 *
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.lambda
 * @Description: TODO
 * @date Date : 2019年09月28日 11:14
 */
public interface Converter<F,T> {
    T convert(F from);
}
