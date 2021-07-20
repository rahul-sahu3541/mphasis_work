package com.mphasis;

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
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
class Process{
    public void change(Point point){
        System.out.println(point);
        point.x = 3;
        point.y=4;

    }

}
public class Main {

    public static void main(String[] args) {
	    Point point = new Point(2,4);
	    new Process().change(point);
        System.out.println(point);

    }
}
