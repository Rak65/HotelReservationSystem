package com.hotelreservationsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReservationSystem {
    private List<Hotel> hotels = new ArrayList<>();

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public void displayHotels() {
        for (Hotel hotel : hotels) {
            System.out.println("Hotel: " + hotel.getName());
            System.out.println("Weekday Rate (Regular Customer): $" + hotel.getWeekdayRateRegularCustomer());
            System.out.println("Weekend Rate (Regular Customer): $" + hotel.getWeekendRateRegularCustomer());
            System.out.println("---------------");
        }
    }

    public Hotel findCheapestHotel(LocalDate startDate, LocalDate endDate) {
        Optional<Hotel> cheapestHotel = hotels.stream()
                .min(Comparator.comparingDouble(hotel -> hotel.calculateTotalRate(startDate, endDate)));

        return cheapestHotel.orElse(null);
    }
}
