package com.hotelreservationsystem;

import java.time.LocalDate;
import java.util.Scanner;

public class HotelReservationSystem {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        Scanner scanner = new Scanner(System.in);

        reservationSystem.addHotel(new Hotel("Lakewood", 110, 90));
        reservationSystem.addHotel(new Hotel("Bridgewood", 160, 60));
        reservationSystem.addHotel(new Hotel("Ridgewood", 220, 150));

        System.out.println("Available Hotels:");
        reservationSystem.displayHotels();

        LocalDate startDate = LocalDate.of(2020, 9, 10);
        LocalDate endDate = LocalDate.of(2020, 9, 11);

        Hotel cheapestHotel = reservationSystem.findCheapestHotel(startDate, endDate);

        if (cheapestHotel != null) {
            System.out.println("Cheapest Hotel: " + cheapestHotel.getName() +
                    ", Total Rates: $" + cheapestHotel.calculateTotalRate(startDate, endDate));
        } else {
            System.out.println("No hotels available.");
        }
    }
}