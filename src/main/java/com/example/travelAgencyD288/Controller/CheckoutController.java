package com.example.travelAgencyD288.Controller;

import com.example.travelAgencyD288.DTO.PurchaseDto;
import com.example.travelAgencyD288.DTO.PurchaseResponse;
import com.example.travelAgencyD288.Entity.*;
import com.example.travelAgencyD288.Services.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/checkout")
public class CheckoutController {

    private final CheckoutService checkoutService;

    @Autowired
    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public ResponseEntity<PurchaseResponse> purchase(@RequestBody PurchaseDto purchase) {








        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return ResponseEntity.ok(purchaseResponse);
    }

}
