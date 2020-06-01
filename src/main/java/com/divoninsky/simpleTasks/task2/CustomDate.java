package com.divoninsky.simpleTasks.task2;

public class CustomDate {
    private int month;
    private int day;

    public CustomDate(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "CustomDate{" +
                "month=" + month +
                ", day=" + day +
                '}';
    }
}
