package com.turkcell.pair5.customerservice.repositories.abstracts;

import com.turkcell.pair5.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
