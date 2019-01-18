package com.liuzj.kafka.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author liuzj
 * @date 2019-01-18
 */
public interface MqSinkI {

    String INPUT = "input";

    /**
     * 消费者接口
     *
     * @return org.springframework.messaging.SubscribableChannel 接口对象
     */
    @Input(MqSinkI.INPUT)
    SubscribableChannel input();

}