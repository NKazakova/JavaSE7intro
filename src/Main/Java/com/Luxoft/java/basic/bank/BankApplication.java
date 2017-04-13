package com.Luxoft.java.basic.bank;

import com.Luxoft.java.basic.Person;

/**
 * Created by user on 12.04.2017.
 */
public class BankApplication {

    private Bank bank;


    public BankApplication (){
        this (new Bank("Cber")); /*главный конструктор*/
    }

    public BankApplication(Bank bank) {
        this.bank = bank;
    }

    /*статический блок  инициализации*/
      private static int counter;
    static {
        /*сюда вносится логика инициализации класса*/
        counter=5;
    }

    public static void main(String[] args) {


       /* имплементация интерфейсов*/
        A a = new A();
        A a1 = new B();
        B b = new B();
        D a3 = new D();
        C c = new D();

        a.m();b.m2();a3.m3(3);



        Account account=new Account(
                new Person("John",35),500,1000
        );
        System.out.println(account);

    }
}
