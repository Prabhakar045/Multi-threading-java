package com.Xworkz.MultiThreadConcpets.ThreadBegining;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tester3 implements  Runnable{

    @Override
    public void run() {
        System.out.println("start method will call run method");
    }

    // Thread pool - java 1.5
    //1. single Thread pool - 1 thread
    //2. Fixed Thread pool  - 8  (here ucan tell how many threads uwant)
    //3. cached Thread pool  - Creating the threads depends on the JVM
    //4. Scheduled Thread pool - If you want to use thread after some delay or time u can go with schedul

    //Executor - will help us to In order to  work or create Thread pool
    // Java.util.concurrent packgae , so many classes and interfaces are defined

    // Using synchronized keyword in java synchronization(multiple task executing parallel) is achieved (ex: in Vector class)


    public static void main(String[] args) {

        Tester3 tester3 = new Tester3();
        Thread thread = new Thread();
        thread.start();

        // Single Thread pool
        ExecutorService es = Executors.newSingleThreadExecutor();

        //Fixed Thread pool
        ExecutorService es2= Executors.newFixedThreadPool(4);

        //Cached Thread pool
         ExecutorService es3= Executors.newCachedThreadPool();

         //Scheduled Thread pool
        ExecutorService es4 = Executors.newScheduledThreadPool(5);


    }


}
