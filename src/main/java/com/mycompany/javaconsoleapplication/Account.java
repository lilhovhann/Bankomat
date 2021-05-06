package com.mycompany.javaconsoleapplication;

/**
 *
 * @author lilith
 */
public class Account {
    private long id;
    private long personId;
    private double balance;

    public Account(long id, long personId, double balance) {
        this.id = id;
        this.personId = personId;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}
