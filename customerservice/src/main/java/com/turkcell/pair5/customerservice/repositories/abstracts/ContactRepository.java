package com.turkcell.pair5.customerservice.repositories.abstracts;

import com.turkcell.pair5.customerservice.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
