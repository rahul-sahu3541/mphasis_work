package com.mphasis;

class Data {
    private int value;

    public void getValue() {
        System.out.println(value);;
    }

    public void setValue(int value) {
        this.value = value;
    }
}



class Task implements Runnable {
    Data data;


    //public Task(Data data) {
        //this.data = data;
    //}

    public Task(){

    }


    @Override
    public void run() {
        for (int counter = 0; counter < 10; counter++) {
            Thread currThread = Thread.currentThread();
            System.out.println(currThread);
            if (currThread.getName().equals("Producer")) {
                synchronized (data) {
                    data.setValue(counter);
                    try {
                        data.notify();
                        data.wait();
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }

            } else if (currThread.getName().equals("Producer")) {

                synchronized (data) {
                    data.getValue();
                    try {
                        data.notify();
                        data.wait();
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }
            }
        }
    }
}


public class Main {



    public static void main(String[] args) {

        Task task = new Task();
        Thread thread1 = new Thread(task, "Producer");
        Thread thread2 = new Thread(task, "Consumer");
        thread1.start();
        thread2.start();
        // write your code here
    }
}
