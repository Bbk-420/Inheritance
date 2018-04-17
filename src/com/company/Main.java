package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
    /*    Scanner sc= new Scanner(System.in);
        BasePlusCommissionEmployee basePlusCommissionEmployee=new BasePlusCommissionEmployee("BBk","Developer",100,0.1,10000);
        System.out.println("**************************************************************************************");
        System.out.print("Name::"+basePlusCommissionEmployee.getName());
        System.out.println("\t\tEmployee::"+basePlusCommissionEmployee.getEmployeeId());
        System.out.print("grossSell::"+basePlusCommissionEmployee.getGrossSell());
        System.out.println("\t\tCommissionRate::"+basePlusCommissionEmployee.getCommissionRate());
      // System.out.print("baseSalary::"+baseSalary()); */

      CommissionEmployee commissionEmployee=
              new CommissionEmployee("bbk","012",100,
                      0.2);

      BasePlusCommissionEmployee basePlusCommissionEmployee=
              new BasePlusCommissionEmployee("krishna","123",
                      200,0.3,12000);

      ///create list
       // System.out.println(basePlusCommissionEmployee.getEmployeeId());
        List<EmployeeDetails> list=new ArrayList<>();
        EmployeeDetails employeeDetails=new EmployeeDetails();

        employeeDetails.setName(commissionEmployee.getName());
        employeeDetails.setEmployeeId(commissionEmployee.getEmployeeId());
        employeeDetails.setGrossSell(commissionEmployee.getGrossSell());
        employeeDetails.setCommissionRate(commissionEmployee.getCommissionRate());
        employeeDetails.setBaseSalary(0);
        employeeDetails.setEmployeeType(EmployeeType.COMM_EMP);
        employeeDetails.setEarning(commissionEmployee.earning());
        list.add(employeeDetails);

        EmployeeDetails employeeDetails1=new EmployeeDetails();
        employeeDetails1.setName(basePlusCommissionEmployee.getName());
        employeeDetails1.setEmployeeId(basePlusCommissionEmployee.getEmployeeId());
        employeeDetails1.setGrossSell(basePlusCommissionEmployee.getGrossSell());
        employeeDetails1.setCommissionRate(basePlusCommissionEmployee.getCommissionRate());
        employeeDetails1.setBaseSalary(0);
        employeeDetails1.setEmployeeType(EmployeeType.BASE_PLUS_COMM_EMP);
        employeeDetails1.setEarning(basePlusCommissionEmployee.earning());
        list.add(employeeDetails1);


      System.out.println("**********************************************************");
        for(EmployeeDetails details:list){
            System.out.println(details.getName()+"     "+
            details.getEmployeeId()+"      "+details.getGrossSell()+"     "+details.getCommissionRate()
                    +"     "+details.getEmployeeType()+"      "+details.getEarning());
        }
      System.out.println("**************************************************************");
    }
}
