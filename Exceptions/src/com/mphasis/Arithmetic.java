package com.mphasis;

public class Arithmetic {
    public int sum1(int inum1, int num2){
        return inum1+num2;
    }

    public static void main(String[] args) {
        System.out.println("start");
        assert new Arithmetic.sum1(3,5);
    }


    }
}
