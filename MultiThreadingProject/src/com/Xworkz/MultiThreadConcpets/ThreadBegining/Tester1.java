package com.Xworkz.MultiThreadConcpets.ThreadBegining;

public class Tester1 implements  Runnable{


    @Override
    public void run() {
        System.out.println("run method ");
    }

    public static void main(String[] args) {
        // inorder to call the start method of Thread class ,  need to create Thread Object
        Tester1 at = new Tester1();  // Runnable object
        Thread t = new Thread(at);
        t.start();

        Thread t2 = new Thread(new Tester1());  // in Single line
        t2.start();
    }
}
