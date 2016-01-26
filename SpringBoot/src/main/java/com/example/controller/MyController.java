package com.example.controller;

import com.example.model.MyThing;
import com.example.mybatis.mapper.MyThingMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhouchunjie on 16/1/26.
 */
@RestController public class MyController {
    private static final Logger logger = LoggerFactory.getLogger(MyController.class);
    private MyThingMapper myThingMapper;

    @Autowired public void setMyThingMapper(MyThingMapper myThingMapper) {
        this.myThingMapper = myThingMapper;
    }

    @RequestMapping("/") String home() {
        return "Hello World!";
    }

    @RequestMapping("/thing") public MyThing getMyThing() {
        //        try {
        //            MyThing myThing = myThingMapper.selectMyThingById(1);
        MyThing myThing = new MyThing(1, "myThing", "my thing desc");
        return myThing;
        //        } catch (Exception e) {
        //            logger.error("select my thing by id error", e);
        //        }
        //        return new MyThing();
    }
}
