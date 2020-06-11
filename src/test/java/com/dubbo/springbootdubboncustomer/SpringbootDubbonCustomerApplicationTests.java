package com.dubbo.springbootdubboncustomer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.dubbo.springbootdubboncustomer.server.ClientServer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDubbonCustomerApplicationTests {

    @Autowired
    ClientServer clientServer;

    @Test
    void contextLoads() {
        System.out.println(clientServer.test());
    }

}
