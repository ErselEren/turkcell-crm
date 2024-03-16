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

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @OneToOne
    @JoinColumn(name = "nationality_id")
    private Nationality nationality;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="account_number")
    private String accountNumber;

    @Column(name="gsmNumber")
    private String gsmNumber;

    @Column(name="email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    //private List<String> orderIDs;

    //private List<Role> roles;

    //private List<Address> addresses;


    public Customer() {
    }

    /*
        Nationality -> id, natianality name
        Address -> country, city, street
        Contact -> mail, home phone, mobile phone, fax
        Account -> status, accountnumber, account name, account type, action

     */



}
