package com.mphasis.main.cui;
import javafx.concurrent.Task;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class task implements Runnable{
    CyclicBarrier barrier;
    String name;
    int duration;
    public task(CyclicBarrier barrier ,String name,int duration){
        this.barrier=barrier;
        this.duration=duration;
        this.name = name;
    }

    @Override
    public void run() {

        Logger logger = Logger.getLogger(Task.class.getName());
        logger.log(Level.INFO,Thread.currentThread()+" Started...");
        try {
            Thread.sleep(duration);
            barrier.await();
        } catch (InterruptedException  | BrokenBarrierException exception) {
            exception.printStackTrace();
        }

        logger.log(Level.INFO,name+ " Resuming....");
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here

        int vCPU = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(vCPU);
        CyclicBarrier barrier = new CyclicBarrier(3);
        service.execute(new task(barrier,"task1",2000));
        service.execute(new task(barrier,"task2",5000));
        service.execute(new task(barrier,"task3",7000));

        service.shutdown();
        Logger.getLogger(Main.class.getName()).log(Level.INFO,"End of main");
    }
}

