package com.Xworkz.MultiThreadConcpets.SynchronizationInThreads;

public class AtmThread extends Thread {

    SbiBank object;

    public  AtmThread(SbiBank object){
        this.object=object;
    }

    @Override
    public void run() {
        System.out.println("pbk  withdrawing money from his account");
        object.withdraw(5000);
    }
}
