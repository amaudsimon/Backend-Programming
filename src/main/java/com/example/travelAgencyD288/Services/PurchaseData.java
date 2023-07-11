package com.example.travelAgencyD288.Services;

import com.example.travelAgencyD288.Entity.Cart;
import com.example.travelAgencyD288.Entity.CartItem;
import com.example.travelAgencyD288.Entity.Customer;
import com.example.travelAgencyD288.DAO.CartDAO;
import com.example.travelAgencyD288.DAO.CartItemDAO;
import com.example.travelAgencyD288.DAO.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PurchaseData {
    private CartDAO cartDAO;
    private CartItemDAO cartItemDAO;
    private CustomerDAO customerDAO;

    @Autowired
    public PurchaseData(CustomerDAO customerDAO, CartDAO cartDAO, CartItemDAO cartItemDAO) {
        this.customerDAO = customerDAO;
        this.cartDAO = cartDAO;
        this.cartItemDAO = cartItemDAO;

    }

    public List<Cart> getCustomerCarts(Customer customer) {
        return cartDAO.findByCustomer(customer);
    }

    public List<CartItem> getCustomerCartItems(Cart cart) {return cartItemDAO.findByCart(cart);
    }

    public void savePurchaseData(Customer customer, Cart cart, Set<CartItem> cartItems) {
        customerDAO.save(customer);
        cartDAO.save(cart);
        cartItemDAO.saveAll(cartItems);
    }
}