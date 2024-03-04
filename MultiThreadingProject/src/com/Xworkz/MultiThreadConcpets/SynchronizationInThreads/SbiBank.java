package com.Xworkz.MultiThreadConcpets.SynchronizationInThreads;

public class SbiBank {

    double balance;

    public SbiBank(double balance) {
        this.balance = balance;
    }

    synchronized public void withdraw(double withdrawAmount) {
        this.balance = balance - withdrawAmount;
    }

    synchronized public void deposit(double depositAmount) {
        this.balance = balance + depositAmount;
    }
}

