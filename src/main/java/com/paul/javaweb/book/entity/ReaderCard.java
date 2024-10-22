package com.paul.javaweb.book.entity;

import java.io.Serializable;

public class ReaderCard implements Serializable {

    private int readerId;
    private String name;
    private String passwd;
    private int cardState;

    public void setCardState(int cardState) {
        this.cardState = cardState;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public int getReaderId() {
        return readerId;
    }

    public int getCardState() {
        return cardState;
    }

    public String getName() {
        return name;
    }

    public String getPasswd() {
        return passwd;
    }

    @Override
    public String toString() {
        return "ReaderCard{" +
                "readerId=" + readerId +
                ", name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                ", cardState=" + cardState +
                '}';
    }
}
