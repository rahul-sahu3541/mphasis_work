package com.mphasis.main.cui;

import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static Logger logger;
    static {
            logger = Logger.getLogger(Main.class.getName());
    }
    public static int handle(Throwable throwable){
        logger.log(Level.INFO, "ERROR " + throwable);
        return 0;
    }
    public static void process(CompletableFuture<Integer> completableFuture){

        logger.log(Level.INFO,"Started..");
        completableFuture
                .thenApply((data)-> data +2)
                .thenApply((data)-> data*3)
                .thenApply(data -> data/0)
                .exceptionally((throwable -> handle(throwable)))
                .thenAccept((data) -> System.out.println(" Data " + data))
                .thenRun(()-> System.out.println("Task1"));

        logger.log(Level.INFO,"End");

    }
    public static void main(String[] args) {
	// write your code here
        CompletableFuture<Integer> completableFuture = new CompletableFuture<Integer>();

        process(completableFuture);
        completableFuture.complete(2);
        logger.log(Level.INFO,"End of Main");

    }
}
