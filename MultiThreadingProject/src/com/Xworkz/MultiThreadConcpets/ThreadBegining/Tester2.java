package com.Xworkz.MultiThreadConcpets.ThreadBegining;

public class Tester2 {

    public static void main(String[] args) {

        //Different threadStates in java
        // 1. New -> It is step Thread Object is created but start method not invoked or called.
                      // t1.start() -> The request will sent to the OS (Runnable pool).
                      // Depending on OS and available resources , OS will allocate memory to some thread from Runnable pool and that Thread willl get executed .
                      // After that run method is called
        // 2. Runnable -> whenever start method is called that state is called as runnable state
        //3. Running  -> whenever start() method call run method that state is called running state.
        //4. Dead  -> after completion of running state or run() method execution called as dead state

        Tester2 tester2 = new Tester2();
        for (int i = 0; i < 1000000; i++) {
            Thread t1= new Thread();  // Thread is platform dependent
            t1.start();
            t1.start();
        }


        // Drawback of Thread is once we create Thread Object we cannot re use it.  / it will throw illigalStateException if we start same thread (it means once life cycle of thread is complete we have to create new thread)
        // to overcome this drawback
        // java 1.5 version onwards, java.util.concurrent package is introduced (thread pool concept is introduced)
        // to implement Thread pool they introduced a Framework  called Executor

    }
}
