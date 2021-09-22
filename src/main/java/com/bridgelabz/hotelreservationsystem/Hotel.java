package com.bridgelabz.hotelreservationsystem;

public class Hotel {
    private String hotelName;
    private long weekDayRegularCustomerRate;
    private long weekendDayRegularCustomerRate;
    private int rating;

    public Hotel() {

    }

    public Hotel(String hotelName, long weekDayRegularCustomerRate, long weekendDayRegularCustomerRate, int rating) {
        this.hotelName = hotelName;
        this.weekDayRegularCustomerRate = weekDayRegularCustomerRate;
        this.weekendDayRegularCustomerRate = weekendDayRegularCustomerRate;
        this.rating = rating;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public long getWeekDayRegularCustomerRate() {
        return weekDayRegularCustomerRate;
    }

    public void setWeekDayRegularCustomerRate(long weekDayRegularCustomerRate) {
        this.weekDayRegularCustomerRate = weekDayRegularCustomerRate;
    }

    public long getWeekendDayRegularCustomerRate() {
        return weekendDayRegularCustomerRate;
    }

    public void setWeekendDayRegularCustomerRate(long weekendDayRegularCustomerRate) {
        this.weekendDayRegularCustomerRate = weekendDayRegularCustomerRate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
