package com.rian.ecommerce.service;

import com.rian.ecommerce.dao.CustomerRepository;
import com.rian.ecommerce.dto.Purchase;
import com.rian.ecommerce.dto.PurchaseResponse;
import org.springframework.stereotype.Service;

@Service
 public class CheckoutServiceImpl implements CheckoutService {

    private CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public PurchaseResponse placeOrder(Purchase purchase) {
        return null;
    }
}
