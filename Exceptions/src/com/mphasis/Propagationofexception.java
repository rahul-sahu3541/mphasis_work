package com.mphasis;

public class Propagationofexception {
    public  void test1() throws ClassNotFoundException {
        test2();
        System.out.println("test1");
    }

    public void test2() throws ClassNotFoundException {
        test3();
        System.out.println("test2");
    }

    public void test3() throws ClassNotFoundException {
        test4();
        System.out.println("test3");
    }

    public void test4() throws ClassNotFoundException {
        Class.forName("java.util.Dat");
        System.out.println("test4");
    }

public static void main(String[] args) {
    try {
        new Propagationofexception().test1();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
        System.out.println("end");
    }
}

}
