package com.liuzj.kafka.producer;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author liuzj
 * @date 2019-01-18
 */
@RestController
public class ProducerController {

    @Autowired
    private SendService service;

    @RequestMapping(value = "/kafka")
    public void send() {

        while (true) {
            //发送消息到指定topic
            JSONObject obj = new JSONObject();
            obj.put("time", (new Date()).toString());
            System.out.println("生产者发送：" + obj.toString());
            service.sendMessage(obj.toString());
            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException e) {

            }
        }

    }

}
