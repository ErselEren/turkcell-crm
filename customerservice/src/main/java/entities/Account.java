package entities;

import jakarta.persistence.*;

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

    public Account(int accountID, String accountNumber, String accountStatus, String accountName, String accountType) {
        this.accountID = accountID;
        this.accountNumber = accountNumber;
        this.accountStatus = accountStatus;
        this.accountName = accountName;
        this.accountType = accountType;
    }

    public Account() {
    }

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
}
