package com.example.travelAgencyD288.Entity;

import java.math.BigDecimal;
import java.util.Set;

public class Excursion extends Customer{
    private String excursion_title;
    private BigDecimal excursion_price;
    private String image_URL;
    private Vacation vacation;
    private Set<CartItem> cartItems;

    Excursion(){

    }

    public String getExcursion_title() {
        return excursion_title;
    }

    public void setExcursion_title(String excursion_title) {
        this.excursion_title = excursion_title;
    }

    public BigDecimal getExcursion_price() {
        return excursion_price;
    }

    public void setExcursion_price(BigDecimal excursion_price) {
        this.excursion_price = excursion_price;
    }

    public String getImage_URL() {
        return image_URL;
    }

    public void setImage_URL(String image_URL) {
        this.image_URL = image_URL;
    }

    public Vacation getVacation() {
        return vacation;
    }

    public void setVacation(Vacation vacation) {
        this.vacation = vacation;
    }

    public Set<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Set<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
