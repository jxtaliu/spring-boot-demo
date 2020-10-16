package com.example.springbootdemo.webflux;

import com.example.springbootdemo.controller.Customer;
import com.example.springbootdemo.controller.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.webflux
 * @Description: TODO
 * @date Date : 2019年10月06日 09:13
 */
@RestController
@RequestMapping("/users1")
public class MyRestController1 {

    @GetMapping("/{user}")
    public Mono<User> getUser(@PathVariable Long user){
        //...
        return null;
    }

    @GetMapping("/{user}/customers")
    public Flux<Customer> getUserCustomers(@PathVariable Long user) {
        // ...
        return null;
    }

    @DeleteMapping("/{user}")
    public Mono<User> deleteUser(@PathVariable Long user) {
        // ...
        return null;
    }
}
