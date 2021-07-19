package com.mphasis.main.cui;

import com.mphasis.entities.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Date date = new Date(06,07 ,2021);
        System.out.println(date);
        String dob = date.toString();
        System.out.println(dob);

    }
}
