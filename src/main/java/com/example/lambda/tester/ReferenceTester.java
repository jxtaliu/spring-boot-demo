package com.example.lambda.tester;

import com.example.lambda.Converter;
import com.example.lambda.Helper;

/**
 * ObjectRef::methodName
 * ObjectRef:类或者实例
 * :: 方法引用符
 * methodName：方法名
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.lambda.tester
 * @Description: TODO
 * @date Date : 2019年09月28日 11:39
 */
public class ReferenceTester {

    static int string2Int(String from){
        return Integer.valueOf(from);
    }
    public static void main(String[] args){
        Helper helper = new Helper();
        //传统用法
        Converter<String, Integer> converter = new Converter<String, Integer>() {
            @Override
            public Integer convert(String from) {
                return Integer.valueOf(from);
            }
        };
        Integer result = converter.convert("5");
        System.out.println(result);

        //使用Lambda 静态方法引用
        Converter<String, Integer> converter1 = ReferenceTester::string2Int;
        result = converter1.convert("6");
        System.out.println(result);

        //使用Lambda 实例方法引用
        Converter<String, Integer> converter2 = helper::string2Int;
        result = converter2.convert("6");
        System.out.println(result);
    }
}
