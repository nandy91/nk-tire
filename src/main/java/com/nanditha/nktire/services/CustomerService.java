package com.nanditha.nktire.services;

import com.nanditha.nktire.model.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;




public interface CustomerService {
    Customer getCustomerById(UUID customerId);
}