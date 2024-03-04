package com.Xworkz.MultiThreadConcpets.SynchronizationInThreads;

public class SbiBankTester {

    public static void main(String[] args) {

        SbiBank pbkAccount = new SbiBank(8000);

        AtmThread atm = new AtmThread(pbkAccount);
        atm.setName("ATM");

        GpayThread gpay = new GpayThread(pbkAccount);
        gpay.setName("GPAY");

        atm.start();
        gpay.start();

        try {
            atm.join();
            gpay.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("balance is: "+pbkAccount.balance);
    }
}
