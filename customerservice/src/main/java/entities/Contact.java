package entities;

import jakarta.persistence.*;

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

}
