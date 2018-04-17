package com.company;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(){
        super();
    }
    public BasePlusCommissionEmployee(String name,String employeeId,
                                      double grossSell,double CommissionRate,double baseSalary){
        super(name,employeeId,grossSell,CommissionRate);
        this.baseSalary=baseSalary;

    }

    public double earning(){
        return baseSalary+super.earning();
    }

}
