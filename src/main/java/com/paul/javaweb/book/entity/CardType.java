package com.paul.javaweb.book.entity;

import java.io.Serializable;

public class CardType implements Serializable {
    int class_state;
    int day_long;
    String type_name;

    public int getClass_state() {
        return class_state;
    }

    public void setClass_state(int class_state) {
        this.class_state = class_state;
    }

    public int getDay_long() {
        return day_long;
    }

    public void setDay_long(int day_long) {
        this.day_long = day_long;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    @Override
    public String toString() {
        return "CardType{" +
                "class_state=" + class_state +
                ", day_long=" + day_long +
                ", type_name='" + type_name + '\'' +
                '}';
    }

    public CardType(int class_state, int day_long, String type_name) {
        this.class_state = class_state;
        this.day_long = day_long;
        this.type_name = type_name;
    }
}
