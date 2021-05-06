package com.mycompany.javaconsoleapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lilith
 */
public class ConsoleApp {

    public static void main(String[] args) {
        Bank bank = new Bank("ArdshinBank", "Abovyan 5/4");
        Person person1 = new Person(System.currentTimeMillis(), "Armen", 34, "male");
        Person person2 = new Person(System.currentTimeMillis() + 1, "Lilit", 23, "female");
        Account account1 = new Account(System.currentTimeMillis() + 2, person1.getId(), 250000);
        Account account2 = new Account(System.currentTimeMillis() + 2, person2.getId(), 200000);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);

        List<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);

       
        Bankomat bankomat = new Bankomat(bank, accounts, persons);
        bankomat.doCheck();
        

    }

   

}
