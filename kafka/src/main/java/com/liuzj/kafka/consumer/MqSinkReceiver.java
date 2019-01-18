package com.liuzj.kafka.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;

/**
 * @author liuzj
 * @date 2019-01-18
 */
@EnableBinding(value = {MqSinkI.class})
public class MqSinkReceiver {

    @Autowired
    MqListener mqListener;

    @StreamListener(Sink.INPUT)
    public void process(Message<?> message, String info) {
        System.out.println(info);
        Acknowledgment acknowledgment = message.getHeaders().get(KafkaHeaders.ACKNOWLEDGMENT, Acknowledgment.class);
        if (acknowledgment != null) {
            System.out.println("Acknowledgment provided");
            acknowledgment.acknowledge();
        }
    }
}