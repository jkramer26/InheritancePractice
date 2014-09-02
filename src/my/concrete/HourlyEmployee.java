/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

public class HourlyEmployee extends Employee {
    private double payRate;
    private double hoursWorked;
    private double employeePay;
    
    //Constructor that inherits superclass's constructor and sets the hourly employee
    //payrate and number of hours worked
    public HourlyEmployee(String name, int employeeID, char gender, int age, double payRate, double hoursWorked) {
        super(name, employeeID, gender, age);
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
    
    //returns the amount an employee made based off their payrate and number of hours worked
    public double getEmployeePay() {
        employeePay = (payRate * hoursWorked);
        
        return employeePay;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    
    
    
}
