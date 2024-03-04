package com.example.kingofperson.customer_module.mapping;

import com.example.kingofperson.customer_module.entity.CustomerEntity;
import com.example.kingofperson.customer_module.entity.CustomerRequest;
import com.example.kingofperson.customer_module.entity.CustomerResponse;

public class CustomerMapping {
    public static CustomerEntity mapRequestToEntity(CustomerRequest customerRequest){
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setTenkh(customerRequest.getName());
        customerEntity.setDiachi(customerRequest.getAddress());
        customerEntity.setDienthoai(customerRequest.getPhone());
        return customerEntity;
    }

    public static CustomerResponse mapEntityToResponse(CustomerEntity customerEntity){
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setId(customerEntity.getId());
        customerResponse.setName(customerEntity.getTenkh());
        customerResponse.setAddress(customerEntity.getDiachi());
        customerResponse.setPhone(customerEntity.getDienthoai());
        return customerResponse;
    }
}
