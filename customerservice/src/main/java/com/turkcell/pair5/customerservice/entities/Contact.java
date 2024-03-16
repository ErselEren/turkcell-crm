package com.turkcell.pair5.customerservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int contactID;

    @Column(name = "mail_address")
    private String mailAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "home_phone_number")
    private String homePhoneNumber;

    @Column(name = "fax_number")
    private String faxNumber;

    @OneToMany(mappedBy = "contact")
    @JsonIgnore
    private List<Customer> customers;

    public Contact(int contactID, String mailAddress, String phoneNumber, String homePhoneNumber, String faxNumber, List<Customer> customers) {
        this.contactID = contactID;
        this.mailAddress = mailAddress;
        this.phoneNumber = phoneNumber;
        this.homePhoneNumber = homePhoneNumber;
        this.faxNumber = faxNumber;
        this.customers = customers;
    }

    public Contact() {
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
