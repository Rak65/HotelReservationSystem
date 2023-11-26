package com.hotelreservationsystem;

import java.time.LocalDate;

class Hotel {
    private String name;
    private double weekdayRateRegularCustomer;
    private double weekendRateRegularCustomer;
    private double weekdayRateRewardsCustomer;
    private double weekendRateRewardsCustomer;
    private int rating;

    public Hotel(String name, double weekdayRateRegularCustomer, double weekendRateRegularCustomer,
                 double weekdayRateRewardsCustomer, double weekendRateRewardsCustomer, int rating) {
        this.name = name;
        this.weekdayRateRegularCustomer = weekdayRateRegularCustomer;
        this.weekendRateRegularCustomer = weekendRateRegularCustomer;
        this.weekdayRateRewardsCustomer = weekdayRateRewardsCustomer;
        this.weekendRateRewardsCustomer = weekendRateRewardsCustomer;
        this.rating = rating;
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

    public double getWeekdayRateRewardsCustomer() {
        return weekdayRateRewardsCustomer;
    }

    public double getWeekendRateRewardsCustomer() {
        return weekendRateRewardsCustomer;
    }

    public int getRating() {
        return rating;
    }

    public double calculateTotalRate(LocalDate startDate, LocalDate endDate, boolean isRewardsCustomer) {
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

        if (isRewardsCustomer) {
            return (weekdayCount * weekdayRateRewardsCustomer) + (weekendCount * weekendRateRewardsCustomer);
        } else {
            return (weekdayCount * weekdayRateRegularCustomer) + (weekendCount * weekendRateRegularCustomer);
        }
    }
}
