package com.mphasis.payroll.entities;



public class Finance {
    public void processSalary(Employee employee){
        if (employee!= null){
            employee.netPay();
        }
        if(employee instanceof Permanent){
            Permanent permanentEmployee = (Permanent) employee;
            permanentEmployee.transportation();

        }
    }
}
