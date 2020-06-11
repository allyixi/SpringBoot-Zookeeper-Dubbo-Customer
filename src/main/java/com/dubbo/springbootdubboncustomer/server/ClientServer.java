package com.dubbo.springbootdubboncustomer.server;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.springbootdubboprovider.server.TargetServer;
import org.springframework.stereotype.Service;


@Service
public class ClientServer {

    @Reference(group = "g1")
//    @Reference(group = "g2")
    TargetServer targetServer;

    public String test(){
        return targetServer.getMessage("client");
    }
}
