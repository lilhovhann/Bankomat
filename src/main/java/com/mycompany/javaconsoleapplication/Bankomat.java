package com.mycompany.javaconsoleapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lilith
 */
public class Bankomat {

    private static List<Person> persons = new ArrayList();
    private static List<Account> accounts = new ArrayList<>();
    private static Bank bank;

    public Bankomat(Bank bank, List<Account> account, List<Person> persons) {
        this.bank = bank;
        this.accounts = account;
        this.persons = persons;
    }

    public Person doCheckPerson(String personName) {
        for (Person item : persons) {
            if (item.getName().equalsIgnoreCase(personName)) {
                System.out.println("Welcome " + item.getName());
                return item;
            }
        }
        System.out.println("You don't have account in our bank yet");
        return null;
    }

    public Account doCheckAccount(Person person) {
        for (Account accountItem : accounts) {
            if (person.getId() == accountItem.getPersonId()) {
                System.out.printf("Your balance is %.0f\n", accountItem.getBalance());
                return accountItem;
            }
        }
        return null;
    }

    public void doReceiveMoney(Double wantedAmmount, Account account) {
        if (wantedAmmount <= account.getBalance()) {
            System.out.printf("Your are getting %.0f drams...\n", wantedAmmount);
            System.out.printf("Your balance is %.0f now\n", account.getBalance() - wantedAmmount);
            
        } else {
            System.out.printf("Your balance is only %.0f, you are poor", account.getBalance());
            
        }
        }              
    }
