package com.hotelreservationsystem;

import java.time.LocalDate;

class Hotel {
    private String name;
    private double weekdayRateRegularCustomer;
    private double weekendRateRegularCustomer;

    public Hotel(String name, double weekdayRateRegularCustomer, double weekendRateRegularCustomer) {
        this.name = name;
        this.weekdayRateRegularCustomer = weekdayRateRegularCustomer;
        this.weekendRateRegularCustomer = weekendRateRegularCustomer;
    }

    public String getName() {
        return name;
    }

    public double getWeekdayRateRegularCustomer() {
        return weekdayRateRegularCustomer;
    }

    public double getWeekendRateRegularCustomer() {
        return weekendRateRegularCustomer;
    }

    public double calculateTotalRate(LocalDate startDate, LocalDate endDate) {
        long diff = endDate.toEpochDay() - startDate.toEpochDay() + 1;
        int weekdayCount = 0;
        int weekendCount = 0;

        for (long i = 0; i < diff; i++) {
            LocalDate currentDate = startDate.plusDays(i);
            int dayOfWeek = currentDate.getDayOfWeek().getValue();
            if (dayOfWeek >= 1 && dayOfWeek <= 5) {
                weekdayCount++;
            } else {
                weekendCount++;
            }
        }

        return (weekdayCount * weekdayRateRegularCustomer) + (weekendCount * weekendRateRegularCustomer);
    }
}
