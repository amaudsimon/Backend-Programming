package com.example.travelAgencyD288.Services;

import com.example.travelAgencyD288.Entity.Customer;
import com.example.travelAgencyD288.Entity.Cart;
import com.example.travelAgencyD288.Entity.CartItem;

import java.util.Set;

public interface CheckoutService {
    void processCheckout(Customer customer, Cart cart, Set<CartItem> cartItems);
}
