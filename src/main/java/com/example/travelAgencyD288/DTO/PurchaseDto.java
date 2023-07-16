package com.example.travelAgencyD288.DTO;

import com.example.travelAgencyD288.Entity.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

@Data
public class PurchaseDto {
    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;
}

