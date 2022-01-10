package com.rian.ecommerce.dto;

import com.rian.ecommerce.entity.Address;
import com.rian.ecommerce.entity.Customer;
import com.rian.ecommerce.entity.Order;
import com.rian.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
