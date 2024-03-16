package com.turkcell.pair5.customerservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "entities")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int accountID;

    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "status")
    private String accountStatus;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "account_type")
    private String accountType;

    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private List<Customer> customers;

    public Account(int accountID, String accountNumber, String accountStatus, String accountName, String accountType, List<Customer> customers) {
        this.accountID = accountID;
        this.accountNumber = accountNumber;
        this.accountStatus = accountStatus;
        this.accountName = accountName;
        this.accountType = accountType;
        this.customers = customers;
    }

    public Account() {}

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
