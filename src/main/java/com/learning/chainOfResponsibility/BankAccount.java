package com.learning.chainOfResponsibility;

/**
 * Created by jszeligowski on 2018-03-17.
 */
public class BankAccount {

    private String pin;
    private String name;
    private double amount;

    public BankAccount(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
