package com.hotelreservationsystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class HotelReservationSystemTest {

    @Test
    void calculateTotalRateRegularCustomer() {
        Hotel hotel = new Hotel("TestHotels", 100, 80, 90, 70, 4);

        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 1, 3);

        double totalRate = hotel.calculateTotalRate(startDate, endDate, false);

        // Assuming weekdays: 2, weekends: 1
        Assertions.assertEquals(280.0, totalRate);
    }

    @Test
    void calculateTotalRateRewardsCustomer() {
        Hotel hotel = new Hotel("TestHotel", 100, 80, 90, 70, 4);

        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 1, 3);

        double totalRate = hotel.calculateTotalRate(startDate, endDate, true);

        // Assuming weekdays: 2, weekends: 1
        Assertions.assertEquals(250.0, totalRate);
    }

    @Test
    void findCheapestHotel() {
        ReservationSystem reservationSystem = new ReservationSystem();
        Hotel hotel1 = new Hotel("Hotel1", 100, 80, 90, 70, 4);
        Hotel hotel2 = new Hotel("Hotel2", 120, 90, 80, 75, 3);

        reservationSystem.addHotel(hotel1);
        reservationSystem.addHotel(hotel2);

        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 1, 3);

        Hotel cheapestHotel = reservationSystem.findCheapestHotel(startDate, endDate, false);

        Assertions.assertEquals(hotel1, cheapestHotel);
    }

    @Test
    void findBestHotel() {
        ReservationSystem reservationSystem = new ReservationSystem();
        Hotel hotel1 = new Hotel("Hotel1", 100, 80, 90, 70, 4);
        Hotel hotel2 = new Hotel("Hotel2", 120, 90, 80, 75, 3);

        reservationSystem.addHotel(hotel1);
        reservationSystem.addHotel(hotel2);

        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 1, 3);

        Hotel bestHotel = reservationSystem.findBestHotel(startDate, endDate, false);

        Assertions.assertEquals(hotel2, bestHotel);
    }
}

