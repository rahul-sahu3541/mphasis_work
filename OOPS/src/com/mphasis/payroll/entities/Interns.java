package com.mphasis.payroll.entities;

public class Interns extends Employee{
    @Override
    public void netPay() {
        System.out.println("Stipend");
    }
}
