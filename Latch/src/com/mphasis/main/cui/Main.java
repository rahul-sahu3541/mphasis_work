package com.mphasis.main.cui;

import javafx.concurrent.Task;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

class task implements Runnable{
    CountDownLatch latch;
    int duration;
    public task(CountDownLatch latch,int duration){
        this.latch=latch;
        this.duration=duration;
    }

    @Override
    public void run() {

        Logger logger = Logger.getLogger(Task.class.getName());
        logger.log(Level.INFO,Thread.currentThread()+" Started...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        latch.countDown();
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here

        int vCPU = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(vCPU);
        CountDownLatch latch =new CountDownLatch(3);
        service.execute(new task(latch,2000));
        service.execute(new task(latch,3000));
        service.execute(new task(latch,4000));
        try {
            latch.await();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        service.shutdown();
        Logger.getLogger(Main.class.getName()).log(Level.INFO,"End of thread");
    }
}

