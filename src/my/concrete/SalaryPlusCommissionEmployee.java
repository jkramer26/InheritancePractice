/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;


public class SalaryPlusCommissionEmployee extends SalariedEmployee{
    private double commissionRate;
    private double totalSales;
    private double pay; 
    private double commissionPay;
    
    //constructor
    public SalaryPlusCommissionEmployee(String name, int employeeID, char gender, int age, double annualSalary, 
            double commissionRate, double totalSales) {
        super(name, employeeID, gender, age, annualSalary);
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }
    
    //method to return the amount of money the employee made of of their commissionRate & totalSales
    public double getCommissionPay() {
        commissionPay = totalSales * commissionRate;
        
        return commissionPay;
    }
    
    public double getCommissionRate() {
        return commissionRate;
    }

    public double getTotalSales() {
        return totalSales;
    }
    
    
    
    
}
