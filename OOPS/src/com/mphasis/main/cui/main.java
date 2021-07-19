package com.mphasis.main.cui;

import com.mphasis.payroll.entities.*;

public class main {
    public static void main(String[] args) {
        HR hr = new HR();
        Finance finance = new Finance();
        Employee[] employees = new Employee[3];
        employees[0] = hr.recruit('p');
        employees[1] = hr.recruit('i');
        employees[2] = hr.recruit('c');
        for(Employee employee: employees){
            finance.processSalary(employee);
        }
    }
}
