package com.mphasis;

public class Finally {
    public static void main(String[] args) {
        try{
            Integer.parseInt("2");
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Exit finally");
        }
    }
}
