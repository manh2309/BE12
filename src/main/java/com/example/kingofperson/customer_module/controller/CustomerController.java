package com.example.kingofperson.customer_module.controller;

import com.example.kingofperson.customer_module.entity.CustomerRequest;
import com.example.kingofperson.customer_module.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customers")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/get")
    public ResponseEntity<?> getCustomers(){
        return new ResponseEntity<>(customerService.getCustomers(), HttpStatus.OK);
    }
}
