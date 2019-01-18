package com.liuzj.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;

/**
 * @author liuzj
 * @date 2019-01-18
 */
@EnableBinding(MySource.class)
public class SendService {

    @Autowired
    private MySource mySource;


    public void sendMessage(String msg) {
        try {
            mySource.output().send(MessageBuilder.withPayload(msg).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

