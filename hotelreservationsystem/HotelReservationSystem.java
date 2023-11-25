package com.hotelreservationsystem;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    private List<Hotel> hotels;

    public HotelReservationSystem() {
        this.hotels = new ArrayList<>();
    }

    public void addHotel(String name, int weekdayRateRegularCustomer, int weekendRateRegularCustomer) {
        Hotel newHotel = new Hotel(name, weekdayRateRegularCustomer, weekendRateRegularCustomer);
        hotels.add(newHotel);
        System.out.println(name + " "+weekdayRateRegularCustomer+" "+weekendRateRegularCustomer);
    }

    public static void main(String[] args) {
        HotelReservationSystem reservationSystem =new HotelReservationSystem();
        reservationSystem.addHotel("Lakewood", 110, 90);
        reservationSystem.addHotel("Bridgewood", 160, 60);
        reservationSystem.addHotel("Ridgewood",  220, 150);
    }
}