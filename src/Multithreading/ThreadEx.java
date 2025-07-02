package Multithreading;

/*
*************** t1.start(); ***************

🔹 Meaning:
Starts a new thread of execution.
JVM creates a separate call stack for this thread.
It calls the run() method in a new thread.

🔹 Outcome:
run() executes asynchronously.
Main thread and t1 thread run in parallel.
Thread.currentThread().getName() inside run() will return something like Thread-0.

Output :
Thread State : NEW
Thread State : RUNNABLE
main
this is Thread 1
Thread-0

*
*
*************** t1.run(); ****************
🔹 Meaning:
This just calls the run() method like a normal method call, NOT as a thread.
Executes on the same (main) thread — no new thread is created.

🔹 Outcome:
No multithreading.
Thread.currentThread().getName() inside run() will return main.

Output :
Thread State : NEW
this is Thread 1
main
Thread State : NEW
main

*/
public class ThreadEx extends Thread {

    @Override
    public void run() {
        System.out.println("this is Thread 1");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadEx t1 = new ThreadEx();
        System.out.println("Thread State : "+t1.getState());
        //t1.start();
        t1.run();
       //Thread.sleep(5000);
        System.out.println("Thread State : "+t1.getState());

        System.out.println(Thread.currentThread().getName());



    }
}
