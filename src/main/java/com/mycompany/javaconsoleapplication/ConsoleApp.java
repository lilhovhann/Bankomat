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
        Person person1 = new Person(System.currentTimeMillis(), "John", 34, "male");
        Account account = new Account(System.currentTimeMillis() + 2, person1.getId() , 1200);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);

        System.out.printf("Bank: %s\nAddress: %s\n", bank.getName(), bank.getAddress());

        Scanner loginInput = new Scanner(System.in);
        System.out.println("Enter your name please: ");
        String inputName = loginInput.nextLine();

        for (Person item : persons) {
            if (item.getName().equalsIgnoreCase(inputName)) {
                System.out.printf("%s your balance is %f\n", item.getName(), account.getBalance());
                Scanner inputM = new Scanner(System.in);
                System.out.println("How much money do you want: ");
                double inputMoney = inputM.nextDouble();
                System.out.printf("Your balance is %f now\n", account.getBalance()-inputMoney);
            }else{
                System.out.println("You don't have account in "+bank.getName()+ " yet");
            }
        }

    }

}
