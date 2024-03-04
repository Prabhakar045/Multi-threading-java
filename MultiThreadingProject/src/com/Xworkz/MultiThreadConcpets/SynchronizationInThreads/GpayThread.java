package com.Xworkz.MultiThreadConcpets.SynchronizationInThreads;

public class GpayThread extends Thread{

    SbiBank object;

    public  GpayThread(SbiBank object){
        this.object=object;
    }
    @Override
    public void run() {
        System.out.println("shekhar sending money gpay to my account or gpay");
        object.deposit(2000);
    }
}
