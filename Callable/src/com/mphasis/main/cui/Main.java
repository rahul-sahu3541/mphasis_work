package com.mphasis.main.cui;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

class Point{
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
class Task implements Callable<Point>{
    AtomicInteger  counter;
    Task(){
        counter = new AtomicInteger(1);
    }

    @Override
    public Point call() throws Exception {
        System.out.println(Thread.currentThread());
        Thread.sleep(3000);
        return new Point(counter.getAndIncrement(),counter.getAndIncrement());
    }
}
public class Main {

    public static void main(String[] args) {
        int vCPU = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(vCPU);
        ArrayList<Future> allFutures = new ArrayList<Future>();

        Task task = new Task();
        for(int counter= 0;counter<4;counter++){
            allFutures.add(service.submit(task));
        }
        for(Future<Point> future:allFutures){

            try {
                ;
                Point point= future.get();
                System.out.println(point);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        }
        System.out.println("End");
        service.shutdown();
	// write your code here
    }
}
