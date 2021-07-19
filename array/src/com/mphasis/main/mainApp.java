package com.mphasis.main;

public class mainApp {
    public static void main(String[] args) {
        int[][] nums;
        nums = new int[5][4];
        nums[1][3]=9;
        nums[3][3]=4;

        for(int[] num: nums) {
            for (int num1 : num) {
                System.out.println(num1);
            }
        }
    }
}
