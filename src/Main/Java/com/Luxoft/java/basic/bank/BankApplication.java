package com.Luxoft.java.basic.bank;

import com.Luxoft.java.basic.Person;

/**
 * Created by user on 12.04.2017.
 */
public class BankApplication {

    public static void main(String[] args) {

        Account account=new Account(
                new Person("John",35),500,1000
        );
        System.out.println(account);

    }
}
