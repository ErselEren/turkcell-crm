package com.turkcell.pair5.customerservice.repositories.abstracts;


import com.turkcell.pair5.customerservice.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
