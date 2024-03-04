package com.example.kingofperson.customer_module.service;

import com.example.kingofperson.customer_module.entity.CustomerRequest;
import com.example.kingofperson.customer_module.entity.ResponseApi;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    ResponseApi getCustomers();
}
