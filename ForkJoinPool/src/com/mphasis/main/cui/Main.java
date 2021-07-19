package com.mphasis.main.cui;

import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static Logger logger;
    static {
        logger = Logger.getLogger(Main.class.getName());
    }
    private static CompletableFuture<Integer> create(){
        return CompletableFuture.supplyAsync(() -> compute());
    }

    private static int compute() {
        logger.log(Level.INFO,"Inside compute");
        return 4;
    }

    public  static void print(Object data){
        logger.log(Level.INFO, Thread.currentThread()+ ">>" + data.toString());
    }

    public static void main(String[] args) {
        // write your code here
        logger.log(Level.INFO,"Begin Main" + Thread.currentThread());
        create()
                .thenApply(data -> data +3)
                .thenAccept(data -> print(data));
        logger.log(Level.INFO,"End of Main");
   }
}