package com.example.lambda.tester;

import com.example.lambda.Converter;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.lambda
 * @Description: TODO
 * @date Date : 2019年09月28日 11:20
 */
public class ConverterTester {
    public static void main(String[] args){
        //传统用法
        Converter<String, Integer> converter = new Converter<String, Integer>() {
            @Override
            public Integer convert(String from) {
                return Integer.valueOf(from);
            }
        };
        Integer result = converter.convert("5");
        System.out.println(result);

        //使用Lambda
        Converter<String, Integer> converter1 = (param) -> Integer.valueOf(param);
        result = converter1.convert("6");
        System.out.println(result);
    }
}
