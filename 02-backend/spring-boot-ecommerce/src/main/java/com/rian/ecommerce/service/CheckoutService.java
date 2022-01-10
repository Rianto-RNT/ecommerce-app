package com.rian.ecommerce.service;

import com.rian.ecommerce.dto.Purchase;
import com.rian.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
