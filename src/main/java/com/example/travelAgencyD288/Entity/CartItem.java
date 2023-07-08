package com.example.travelAgencyD288.Entity;

import java.util.Date;
import java.util.Set;

public class CartItem extends Customer{
    private Vacation vacation;
    private Set<Excursion> excursions;
    private Cart cart;

    CartItem(){

    }

    public Vacation getVacation() {
        return vacation;
    }

    public void setVacation(Vacation vacation) {
        this.vacation = vacation;
    }

    public Set<Excursion> getExcursions() {
        return excursions;
    }

    public void setExcursions(Set<Excursion> excursions) {
        this.excursions = excursions;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
