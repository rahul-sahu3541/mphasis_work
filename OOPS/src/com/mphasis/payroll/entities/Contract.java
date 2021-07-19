package com.mphasis.payroll.entities;

public class Contract extends Employee {

    @Override
    public void netPay() {
        System.out.println("Contract Salary");
    }
}
