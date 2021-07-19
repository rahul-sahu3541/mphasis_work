package com.mphasis;


public class Main {

    public static void main(String[] args) {
	// w
        Runnable task = new Runnable(){

            @Override
            public void run() {
                Thread currThread = new Thread();
                for(int counter = 0;counter<10;counter++){
                    System.out.println(currThread+ String.valueOf(counter));
                }
            }
        };
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread);

        Thread thread1 =new Thread(task,"Thread1");
        Thread thread2 =new Thread(task,"Thread2");
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());

        thread1.start();
        thread2.start();
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(mainThread.getState());
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());

    }
}
