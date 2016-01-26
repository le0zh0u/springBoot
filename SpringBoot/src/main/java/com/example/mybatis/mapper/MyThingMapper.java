package com.example.mybatis.mapper;


import com.example.model.MyThing;

/**
 * Created by zhouchunjie on 16/1/26.
 */
public interface MyThingMapper {
    MyThing selectMyThingById(int id);
}
