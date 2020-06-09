package com.nanditha.nktire.services;

import com.nanditha.nktire.model.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCustomerById(UUID customerId) {
        return Customer.builder().id(UUID.randomUUID()).name("Nanditha").build();
    }
}
