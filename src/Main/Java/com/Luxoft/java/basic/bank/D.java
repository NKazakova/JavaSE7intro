package com.Luxoft.java.basic.bank;

/**
 * Created by user on 13.04.2017.
 */
public class D extends B implements C {


    @Override
    public void m3(int i) {
        System.out.printf(
             "from %s: меня вызвали", getClass().getName());

    }
}
