package com.turkcell.pair5.customerservice.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    private String username;

    private String password;

    //private Nationality nationality;

    //private List<Address> addresses;

    //private Contact contact;

    private String firstName;

    private String lastName;

    private String accountNumber;

    private String gsmNumber;

    private String email;

    @ManyToOne
    private Account account;

    @ManyToOne
    private Contact contact;

    //private List<String> orderIDs;

    //private List<Role> roles;

    //private List<Account> accounts;

    public Customer() {
    }
    /*
        Nationality -> id, natianality name
        Address -> country, city, street
        Contact -> mail, home phone, mobile phone, fax
        Account -> status, accountnumber, account name, account type, action

     */



}
