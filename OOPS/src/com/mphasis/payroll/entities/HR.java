package com.mphasis.payroll.entities;

public class HR {
    public Employee recruit(char empType) {
        if (empType == 'P' || empType == 'p') {
            return new Permanent();
        } else if (empType == 'I' || empType == 'i') {
            return new Interns();
        }
        else if (empType == 'C' || empType == 'c') {
            return new Contract();
        }
        return null;
    }
}
