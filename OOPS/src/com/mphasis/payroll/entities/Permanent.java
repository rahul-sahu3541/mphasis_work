package com.mphasis.payroll.entities;

public  class Permanent extends Employee {

    @Override
    public void netPay() {
        System.out.println("Salary");

    }
    public void transportation(){
        System.out.println("Transportation Provided");
    }
}
