package com.mphasis.main.cui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
class Point{
    int x;
    int y;

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

public class Main {
    private static Logger logger;
    static {
        logger = Logger.getLogger(Main.class.getName());
    }
    public static void main(String[] args) {
	// write your code here
        ArrayList<Point> result = new ArrayList<Point>();
        result.add(new Point(2,4));
        result.add(new Point(5,6));
        result.add(new Point(6,9));


        result.forEach(new Consumer<Point>() {
            @Override
            public void accept(Point point) {
                logger.log(Level.INFO,point.toString());
            }
        });

        result.forEach((point) -> logger.log(Level.INFO,point.toString()));
        result.forEach(point -> logger.log(Level.INFO,point.toString()));
        result.forEach(point -> System.out.println(point));
        result.forEach(System.out::println);
    }
}
