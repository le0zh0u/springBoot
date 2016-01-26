package com.example.model;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by zhouchunjie on 16/1/26.
 */
@Repository public class MyThing implements Serializable {

    private int id;

    private String name;

    private String desc;

    public MyThing() {
    }

    public MyThing(int id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override public String toString() {
        return "MyThing{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
