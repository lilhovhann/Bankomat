/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaconsoleapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lilith
 */
public class Bankomat {

    List<Person> persons = new ArrayList();
    List<Account> accounts = new ArrayList<>();
    Bank bank;

    public Bankomat(Bank bank, List<Account> account, List<Person> persons) {
        this.bank = bank;
        this.accounts = account;
        this.persons = persons;
    }

    public void doCheck() {
        System.out.printf("Bank: %s\nAddress: %s\n", bank.getName(), bank.getAddress());
        Scanner loginInput = new Scanner(System.in);
        System.out.println("Enter your name please: ");
        String inputName = loginInput.nextLine();
        for (Person item : persons) {
            if (item.getName().equalsIgnoreCase(inputName)) {
                System.out.println("Welcome " + item.getName());
                for (Account moneyItem : accounts) {
                    if (item.getId() == moneyItem.getPersonId()) {
                        System.out.printf("Your balance is %.0f\n", moneyItem.getBalance());
                        Scanner inputM = new Scanner(System.in);
                        System.out.println("How much money do you want: ");
                        double inputMoney = inputM.nextDouble();
                        if (inputMoney <= moneyItem.getBalance()) {
                            System.out.printf("Your are getting %.0f drams...\n", inputMoney);
                            System.out.printf("Your balance is %.0f now\n", moneyItem.getBalance() - inputMoney);
                            return;
                        } else {
                            System.out.printf("Your balance is only %.0f, you are poor", moneyItem.getBalance());
                            return;
                        }

                    }
                }
            }

        }
        System.out.println("You don't have account in our bank yet");
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

  

}
