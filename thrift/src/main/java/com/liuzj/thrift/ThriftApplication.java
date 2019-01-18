package com.liuzj.thrift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ThriftApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThriftApplication.class, args);
    }

}

