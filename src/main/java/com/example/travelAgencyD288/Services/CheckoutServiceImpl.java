package com.example.travelAgencyD288.Services;

import com.example.travelAgencyD288.DAO.CartItemRepository;
import com.example.travelAgencyD288.DAO.CartRepository;
import com.example.travelAgencyD288.DAO.CustomerRepository;
import com.example.travelAgencyD288.DTO.*;
import com.example.travelAgencyD288.Entity.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl<Vaction> implements CheckoutService{

    private CustomerRepository customerRepository;
    private CartRepository cartRepository;
    private CartItemRepository cartItemRepository;

    @Autowired
    public CheckoutServiceImpl(CustomerRepository customerRepository, CartRepository cartRepository, CartItemRepository cartItemRepository) {
        this.customerRepository = customerRepository;
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(PurchaseDto purchase) {


        System.out.println("Received purchase data from frontend:");
        System.out.println(purchase);
        System.out.println();


        Customer customer = purchase.getCustomer();
        Customer customer1 = customerRepository.findById(customer.getId())
                .orElseGet(() -> {
                    // Customer does not exist, create a new customer
                    Customer newCustomer = new Customer(
                            customer.getFirstName(),
                            customer.getLastName(),
                            customer.getAddress(),
                            customer.getPostal_code(),
                            customer.getPhone(),
                            null,
                            null,
                            null
                    );
                    customerRepository.save(newCustomer);
                    return newCustomer;
                });
        System.out.println(customer1);


        Cart cart = purchase.getCart();

        Cart cart1 = new Cart(
                cart.getPackage_price(),
                cart.getParty_size(),
                StatusType.ordered,
                cart.getOrderTrackingNumber(),
                cart.getCreateDate(),
                cart.getLastUpdate(),
                cart.getCustomer()
        );
        cart1.setCustomer(customer1);

        String orderTrackingNumber = generateOrderTrackingNumber();
        cart1.setOrderTrackingNumber(orderTrackingNumber);
        cartRepository.save(cart1);
        System.out.println(cart1);




        Set<CartItem> cartItems = purchase.getCartItems();
        for (CartItem item : cartItems) {
            Vacation vacation = item.getVacation();
            Cart carts = cart1;
            System.out.println(cart1);

            CartItem cartItem = new CartItem(
                    vacation,
                    carts,
                    item.getCreateDate(),
                    item.getLastUpdate()
            );

            System.out.println(cartItem);
            cartItemRepository.save(cartItem);
        }






        // Generate tracking number




        // Return a response
        return new PurchaseResponse(orderTrackingNumber);

    }


    private String generateOrderTrackingNumber() {
        // generate a random UUID number (UUID version-4)
        // For details see: https://en.wikipedia.ord/wiki/Universally_unique_identifier
        //Standardized method for generating unique ID's
        return UUID.randomUUID().toString();
    }
}