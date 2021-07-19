package com.mphasis.main.cui;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    static Logger logger;
    static {
        logger = Logger.getLogger(Main.class.getName());
    }

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        logger.log(Level.INFO,"Starting Main"+ Thread.currentThread());
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Phaser phaser = new Phaser();
        executor.submit(new DependentService(phaser,2000,"Task1"));
        executor.submit(new DependentService(phaser,3000,"Task2"));
        executor.submit(new DependentService(phaser,5000,"Task3"));

        executor.shutdown();
        logger.log(Level.INFO,"Ending Main");
    }
    static class DependentService implements  Runnable{
        Phaser phaser;
        int Duration;
        String name;

        public DependentService(Phaser phaser, int duration, String name) {
            this.phaser = phaser;
            Duration = duration;
            this.name = name;
        }


        @Override
        public void run() {
            logger.log(Level.INFO,name);
            try {
                Thread.sleep(Duration);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            logger.log(Level.INFO,name+"waiting");
            phaser.arriveAndAwaitAdvance();
            logger.log(Level.INFO,name + "progress");
        }
    }
}
