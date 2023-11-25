package com.hotelreservationsystem;
public class Hotel {
    private String name;
    private int weekdayRateRegularCustomer;
    private int weekendRateRegularCustomer;

    public Hotel(String name, int weekdayRateRegularCustomer, int weekendRateRegularCustomer) {
        this.name = name;
        this.weekdayRateRegularCustomer = weekdayRateRegularCustomer;
        this.weekendRateRegularCustomer = weekendRateRegularCustomer;
    }

    public String getName() {
        return name;
    }

    public int getWeekdayRateRegularCustomer() {
        return weekdayRateRegularCustomer;
    }

    public int getWeekendRateRegularCustomer() {
        return weekendRateRegularCustomer;
    }
}