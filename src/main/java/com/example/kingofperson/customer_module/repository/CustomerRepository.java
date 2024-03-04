package com.example.kingofperson.customer_module.repository;

import com.example.kingofperson.customer_module.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
}
