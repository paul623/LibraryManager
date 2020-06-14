package com.paul.javaweb.book.entity;

public class BookStatus {
    String status;
    String timeLong;

    public BookStatus(String status, String timeLong) {
        this.status = status;
        this.timeLong = timeLong;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimeLong() {
        return timeLong;
    }

    public void setTimeLong(String timeLong) {
        this.timeLong = timeLong;
    }
}
