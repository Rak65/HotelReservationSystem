package com.hotelreservationsystem;

import java.time.LocalDate;

public class HotelReservationSystem {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();

        reservationSystem.addHotel(new Hotel("Lakewood", 110, 90, 80, 80));
        reservationSystem.addHotel(new Hotel("Bridgewood", 160, 60, 110, 50));
        reservationSystem.addHotel(new Hotel("Ridgewood", 220, 150, 100, 40));

        System.out.println("Available Hotels:");
        reservationSystem.displayHotels();

        LocalDate startDate = LocalDate.of(2020, 9, 10);
        LocalDate endDate = LocalDate.of(2020, 9, 11);

        Hotel cheapestHotelRegular = reservationSystem.findCheapestHotel(startDate, endDate, false);
        Hotel cheapestHotelRewards = reservationSystem.findCheapestHotel(startDate, endDate, true);

        System.out.println("Cheapest Hotel (Regular Customer): " + cheapestHotelRegular.getName() +
                ", Total Rates: $" + cheapestHotelRegular.calculateTotalRate(startDate, endDate, false));

        System.out.println("Cheapest Hotel (Rewards Customer): " + cheapestHotelRewards.getName() +
                ", Total Rates: $" + cheapestHotelRewards.calculateTotalRate(startDate, endDate, true));
    }
}