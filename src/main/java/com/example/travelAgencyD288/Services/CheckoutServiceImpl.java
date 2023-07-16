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
        Customer customer1 = new Customer(
                customer.getFirstName(),
                customer.getLastName(),
                customer.getAddress(),
                customer.getPostal_code(),
                customer.getPhone(),
                null,
                null,
                null
        );
        System.out.println(customer1);

        customerRepository.save(customer1);


        Cart cart = purchase.getCart();
        System.out.println("Cart ID before saving: " + cart.getId());

        Cart cart1 = new Cart(
                cart.getPackage_price(),
                cart.getParty_size(),
                StatusType.ordered,
                cart.getOrderTrackingNumber(),
                cart.getCreateDate(),
                cart.getLastUpdate(),
                cart.getCustomer()
        );
        System.out.println(cart1);
        cart1.setCustomer(customer1);

        cartRepository.save(cart1);

        System.out.println("Cart ID after saving: " + cart1.getId());




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
        String orderTrackingNumber = generateOrderTrackingNumber();

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