package com.javaacademy.weddinghost.entity;

import lombok.Data;

@Data
public class Booking {
    private int month;
    private int day;
    private boolean booked;

    public Booking(int month, int day) {
        this.month = month;
        this.day = day;
    }

}
