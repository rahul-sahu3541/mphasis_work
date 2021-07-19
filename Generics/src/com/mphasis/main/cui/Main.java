package com.mphasis.main.cui;
class Point<T>{
    private T x;
    private T y;
    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }
    public T getX() {
        return x;
    }
    public void setX(T x) {
        this.x = x;
    }
    public T getY() {
        return y;
    }
    public void setY(T y) {
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

    public static void main(String[] args) {
	// write your code here
        Point<Integer> point1 = new Point<Integer>(2,5);
        System.out.println(point1);
        Point<Float> point2 = new Point<Float>(2.3f,5.6f);
        System.out.println(point2);
    }
}
