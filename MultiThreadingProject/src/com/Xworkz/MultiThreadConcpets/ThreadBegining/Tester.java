package com.Xworkz.MultiThreadConcpets.ThreadBegining;



public class Tester extends Thread {

    // Tester is Child class
    // Thread is Parent class


    // staring point of general java program is main method but for Thread is run method
//    @Override
//    public void run() {
//        super.run();
//    }

    public static void main(String[] args) {
        // 1st create Child Object instead Parent (Thread ) object bcz child object can access both child and parent properties/methods.
        Thread thread = new Thread();  // it access only parent class properties.
       // Tester t = new Tester();  // instead of creating Thread class object we directly create child class Object , bcz it access both parent and child class properties.

        //t.start();  // start method is  responsible for creating independent path of execution and

        for (int i = 0; i < 4; i++) {
            display();  // it executed in the sequential form and , let us take an ex 2min * 4 = 8 mins and it will take 20 min to excute in sequential
        }

        // instead that , we can create object and  create child Thread object
        // now it totally take 2 min, all  4 objects are executed paralally
        Tester t1 = new Tester();
        t1.start();      // it will invoke child class run method internally
        Tester t2 = new Tester();
        t2.start();
        Tester t3 = new Tester();
        t3.start();
        Tester t4 = new Tester();
        t4.start();

    }


    @Override
    public void run() {
        display();
    }

    public static void display(){

    }
}
