package com.bridgelabz.hotelreservationsystem;

public class Hotel {
    private String hotelName;
    private int rating;
    private long regularCustomerCost;

    public Hotel() {
    }

    public Hotel(String hotelName, int rating, long regularCustomerCost) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.regularCustomerCost = regularCustomerCost;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getRegularCustomerCost() {
        return regularCustomerCost;
    }

    public void setRegularCustomerCost(long regularCustomerCost) {
        this.regularCustomerCost = regularCustomerCost;
    }

    @Override
    public String toString() {
        return "Hotels [hotelName=" + hotelName + ", rating=" + rating + ", Regular Customer Cost=" + regularCustomerCost + "]\n";
    }

}
