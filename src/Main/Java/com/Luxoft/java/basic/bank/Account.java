package com.Luxoft.java.basic.bank;

import com.Luxoft.java.basic.Person;

import java.util.Objects;

/**
 * Created by user on 12.04.2017.
 */
public class Account {
    private Person person;
    private int bill;
    private int overdraft;

    public Account(Person person, int bill, int overdraft) {
        this.person = person;
        this.bill = bill;
        this.overdraft = overdraft;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public Person getPerson() {
        return person;
    }


    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        //todo сделать проверки
        this.overdraft = overdraft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(person, account.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person);
    }

    @Override
    public String toString() {
        return "Account{" +
                "person=" + person.getName() +
                ", bill=" + bill +
                ", overdraft=" + overdraft +
                '}';
    }
}
