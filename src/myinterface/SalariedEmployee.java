/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author owner
 */
public class SalariedEmployee implements Employee {
    
   private String name;
   private int employeeID;
   private char gender;
   private int age;
   private double annualSalary;
   
   public SalariedEmployee(String name, int employeeID, char gender, int age, double annualSalary) {
        this.name = name;
        this.employeeID = employeeID;
        this.gender = gender;
        this.age = age;
        this.annualSalary = annualSalary;
    }
   
   public double getAnnualSalary() {
        return annualSalary;
    }
   
   //overiding methods from employee interface
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public int getEmployeeID() {
        return employeeID;
    }
    @Override
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    
    
    @Override
    public char getGender() {
        return gender;
    }
    @Override
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    
    @Override
    public int getAge() {
        return age;
    }
    @Override
    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public double getEmployeePay() {
        return annualSalary;
    }
   
}
