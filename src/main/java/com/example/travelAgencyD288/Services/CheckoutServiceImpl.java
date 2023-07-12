package com.example.travelAgencyD288.Services;

import com.example.travelAgencyD288.Entity.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    private final PurchaseData purchaseData;

    public CheckoutServiceImpl(PurchaseData purchaseData) {
        this.purchaseData = purchaseData;
    }

    @Override
    public void processCheckout(Customer customer, Cart cart, Set<CartItem> cartItems, Vacation vacation, Excursion excursion) {
        // Retrieve customer information (address, postal code, and phone)
        String address = customer.getAddress();
        String postalCode = customer.getPostalCode();
        String phone = customer.getPhone();

        // Retrieve vacation title
        String vacationTitle = vacation.getVacation_title();

        // Retrieve list of excursions from the customer's cart
        BigDecimal packagePrice = cart.getPackagePrice();


        // Perform any additional processing or business logic related to checkout

        // Print or process the retrieved information as needed
        System.out.println("Customer Info:");
        System.out.println("Address: " + address);
        System.out.println("Postal Code: " + postalCode);
        System.out.println("Phone: " + phone);

        System.out.println("Vacation Title: " + vacationTitle);

        System.out.println("Excursions from Customer's Cart:");
        for (CartItem cartItem : cartItems) {
            System.out.println(cartItem.getVacation().getVacation_title());
        }

        System.out.println("Package Price: " + packagePrice);
    }

}
