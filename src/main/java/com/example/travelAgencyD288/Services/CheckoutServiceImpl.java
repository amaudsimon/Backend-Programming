package com.example.travelAgencyD288.Services;

import org.springframework.stereotype.Service;
import com.example.travelAgencyD288.Entity.Customer;
import com.example.travelAgencyD288.Entity.Cart;
import com.example.travelAgencyD288.Entity.CartItem;

import java.util.Set;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    private final PurchaseData purchaseData;

    public CheckoutServiceImpl(PurchaseData purchaseData) {
        this.purchaseData = purchaseData;
    }

    @Override
    public void processCheckout(Customer customer, Cart cart, Set<CartItem> cartItems) {

        purchaseData.savePurchaseData(customer, cart, cartItems);


    }
}
