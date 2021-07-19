package com.mphasis.com;
class Point{
    static int x;
    static int y;
}
public class main {
    public static void main(String[] args) {
        Point[] points; //stack
        points = new Point[3]; //allocate memory to heap
        points[0] = new Point(); // points to an object
        points[0].x = 5; // assign value to that object
        points[0].y = 6;

        for(Point point:points){
            if(point!=null){
                System.out.println(point.x+ " and "+point.y);
            }

        }

    }
}
