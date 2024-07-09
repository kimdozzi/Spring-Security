package com.example.springsecuritybasic.customer.repository;

import com.example.springsecuritybasic.customer.domain.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByEmail(String email);
}
