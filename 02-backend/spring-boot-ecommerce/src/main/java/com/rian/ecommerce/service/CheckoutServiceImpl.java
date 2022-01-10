package com.rian.ecommerce.service;

import com.rian.ecommerce.dao.CustomerRepository;
import com.rian.ecommerce.dto.Purchase;
import com.rian.ecommerce.dto.PurchaseResponse;
import com.rian.ecommerce.entity.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
 public class CheckoutServiceImpl implements CheckoutService {

    private CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        // retrieve the order info from dto
        Order order = purchase.getOrder();

        // generate tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);

        // populate order with orderItem

        // populate order with billingAddress and shippingAddress
        // populate customer with order
        // save to database
        // return a response
        return null;
    }

    private String generateOrderTrackingNumber() {

        // generate a random UUID number (UUID v4)
        // For detail see: wikipedia keyword: Universally unique identifier
        //
    }
}
