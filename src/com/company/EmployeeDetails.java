package com.company;

public class EmployeeDetails {
    private String name;
    private String employeeId;
    private double grossSell;
    private double commissionRate;
    private double baseSalary;
    private double earning;


    private EmployeeType employeeType;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId= employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public void setGrossSell(double grossSell){
        this.grossSell= grossSell;
    }

    public double getGrossSell() {
        return grossSell;
    }
    public void setCommissionRate(double commissionRate){
        this.commissionRate=commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
    public void setBaseSalary(int i){
        this.baseSalary=baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setEarning(double earning) {
        this.earning = earning;
    }

    public double getEarning() {
        return earning;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

}
