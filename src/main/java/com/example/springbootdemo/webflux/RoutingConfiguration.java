package com.example.springbootdemo.webflux;

import org.springframework.context.annotation.Configuration;


/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.webflux
 * @Description: TODO
 * @date Date : 2019年10月06日 09:21
 */
@Configuration
public class RoutingConfiguration {
//    @Bean
//    public RouterFunction<ServerResponse> monoRouterFunction(UserHandler userHandler) {
//        return route(GET("/\{user}").and(accept(APPLICATION_JSON)), userHandler::getUser)
//                .andRoute(GET("/\{user}/customers").and(accept(APPLICATION_JSON)), userHandler::getUserCustomers)
//                .andRoute(DELETE("/\{user}").and(accept(APPLICATION_JSON)), userHandler::deleteUser);
//    }
}


//@Component
//public class UserHandler {
//
//    public Mono<ServerResponse> getUser(ServerRequest request) {
//        // ...
//    }
//
//    public Mono<ServerResponse> getUserCustomers(ServerRequest request) {
//        // ...
//    }
//
//    public Mono<ServerResponse> deleteUser(ServerRequest request) {
//        // ...
//    }
//}
