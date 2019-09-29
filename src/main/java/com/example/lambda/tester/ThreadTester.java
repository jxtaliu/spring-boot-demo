package com.example.lambda.tester;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.lambda
 * @Description: TODO
 * @date Date : 2019年09月28日 11:26
 */
public class ThreadTester {
    public static void main(String[] args){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello lambda");
            }
        });
        thread.start();



        new Thread(() -> System.out.println("hello lambda")).start();
    }
}
