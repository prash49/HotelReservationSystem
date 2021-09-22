package com.bridgelabz.hotelreservationsystem;

import java.util.HashMap;
import java.util.Map;

public class HotelReservation {
    Map<String, Hotel> hotelMap = new HashMap<String, Hotel>();
    Hotel hotel;

    public boolean addHotel(String hotelNumber, String hotelName, int weekDayRates, int weekendDayRates) {
        hotel = new Hotel();
        hotel.hotelNumber = hotelNumber;
        hotel.setHotelName(hotelName);
        hotel.setWeekendDayRates(weekendDayRates);
        hotel.setWeekDayRates(weekDayRates);
        hotelMap.put(hotelNumber, hotel);
        return true;
    }

    public void displayHotels() {
        for (Map.Entry<String, Hotel> entry : hotelMap.entrySet()) {
            String key = entry.getKey();
            Hotel value = entry.getValue();
            System.out.println("======== " + key + " ========");
            System.out.println("\t\t Hotel name:" + value.hotelName +
                    "\n\t\t rates:  Weekday Rates-" + value.weekDayRates + "\t Weekend days:" + value.weekendDayRates);
        }
    }
}
