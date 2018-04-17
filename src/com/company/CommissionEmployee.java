package com.company;

public class CommissionEmployee {
    private String name;
    private String employeeId;
    private double grossSell;
    private double commissionRate;

    public CommissionEmployee(String name, String employeeId, double grossSell, double commissionRate){
    this.name=name;
    this.employeeId=employeeId;
    this.grossSell=grossSell;
    this.commissionRate=commissionRate;

    }
    public CommissionEmployee(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setGrossSell(double grossSell) {
        this.grossSell = grossSell;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public String getName() {
        return name;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSell() {
        return grossSell;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public double earning(){
        return getCommissionRate()*getGrossSell();
    }
}
