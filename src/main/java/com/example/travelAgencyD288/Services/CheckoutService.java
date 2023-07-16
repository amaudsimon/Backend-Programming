package com.example.travelAgencyD288.Services;

import com.example.travelAgencyD288.DTO.PurchaseDto;
import com.example.travelAgencyD288.DTO.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder (PurchaseDto purchaseDto);
}
