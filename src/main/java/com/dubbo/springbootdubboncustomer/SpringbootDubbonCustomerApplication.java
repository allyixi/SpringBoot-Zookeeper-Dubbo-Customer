package com.dubbo.springbootdubboncustomer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDubbonCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubbonCustomerApplication.class, args);
    }

}
