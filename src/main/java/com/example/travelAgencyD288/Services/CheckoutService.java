package com.example.travelAgencyD288.Services;

import com.example.travelAgencyD288.Entity.*;

import java.util.Set;

public interface CheckoutService {
    void processCheckout(Customer customer, Cart cart, Set<CartItem> cartItems, Vacation vacation, Excursion excursion);
}
