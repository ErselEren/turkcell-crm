package com.turkcell.pair5.customerservice.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;


public class Customer {

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
