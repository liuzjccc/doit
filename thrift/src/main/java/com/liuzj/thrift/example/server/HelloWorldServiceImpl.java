package com.liuzj.thrift.example.server;

import org.apache.thrift.TException;

public class HelloWorldServiceImpl implements HelloWorldService.Iface {

    public HelloWorldServiceImpl() {
    }

    @Override
    public String sayHello(String username){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hi," + username + " welcome to thrift world";
    }
}