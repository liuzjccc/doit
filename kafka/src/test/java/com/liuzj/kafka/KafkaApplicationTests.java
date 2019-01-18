package com.liuzj.kafka;

import com.alibaba.fastjson.JSONObject;
import com.liuzj.kafka.producer.SendService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaApplicationTests {

    @Autowired
    SendService sendService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void contextLoads3(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("is_ident",2);
        jsonObject.put("race",224);
        jsonObject.put("gender",225);
        jsonObject.put("create_time","2018-12-28 11:05:50.412734");
        jsonObject.put("created","2018-12-09 19:33:12.478");
        jsonObject.put("image_url","http://192.168.11.152/company/刘海斌.jpg");
        jsonObject.put("accessories",53729);
        jsonObject.put("person_name","刘海斌");
        jsonObject.put("person_cid","");
        jsonObject.put("appear_time","2018-12-06 23:58:41");
        jsonObject.put("image_count",448);
        jsonObject.put("id",225);
        jsonObject.put("archive_id","5137358707252865");
        jsonObject.put("delete_flag",0);
        jsonObject.put("updated","2018-12-06 19:33:12.478");
        jsonObject.put("age",7174);
        for (int j= 1; j <= 10000; j++) {
            jsonObject.put("archive_id", UUID.randomUUID().toString().replaceAll("-", ""));
            sendService.sendMessage(jsonObject.toJSONString());
        }
    }

}

