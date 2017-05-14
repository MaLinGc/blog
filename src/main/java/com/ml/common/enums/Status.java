package com.ml.common.enums;

public enum Status {

    create("草稿"), publish("发布");

    String desc;

    Status(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
