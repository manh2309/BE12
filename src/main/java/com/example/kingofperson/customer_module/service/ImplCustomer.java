package com.example.kingofperson.customer_module.service;

import com.example.kingofperson.customer_module.entity.CustomerEntity;
import com.example.kingofperson.customer_module.entity.CustomerRequest;
import com.example.kingofperson.customer_module.entity.CustomerResponse;
import com.example.kingofperson.customer_module.entity.ResponseApi;
import com.example.kingofperson.customer_module.mapping.CustomerMapping;
import com.example.kingofperson.customer_module.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ImplCustomer implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public ResponseApi getCustomers(){
        try {
            List<CustomerEntity> customerEntityList = customerRepository.findAll();
            List<CustomerResponse> customerResponseList = customerEntityList.stream().map(CustomerMapping::mapEntityToResponse).collect(Collectors.toList());
            return new ResponseApi(true,"Lấy dữ liệu thành công",customerResponseList);
        }catch (Exception e){
            return new ResponseApi(false, e.getMessage(), null);
        }
    }
}
