package com.liuzj.kafka.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author liuzj
 * @date 2019-01-18
 */
public interface MySource {


    String OUTPUT = "output";

    @Output(MySource.OUTPUT)
    MessageChannel output();

}