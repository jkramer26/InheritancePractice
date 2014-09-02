/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;


public class HourlyEmployee extends Employee {
    private double payRate;
    private double hoursWorked;
    
    //Constructor that inherits superclass's constructor and sets the hourly employee
    //payrate and number of hours worked
    public HourlyEmployee(String name, int employeeID, char gender, int age, double payRate, double hoursWorked) {
        super(name, employeeID, gender, age);
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    
    
    //returns employee pay & overrides abstract method in superclass
    @Override
    public double getEmployeePay() {
        double employeePay;
        
        //calculate hourly employees pay
        employeePay = payRate * hoursWorked;
        
        //return calculated employee pay
        return employeePay;
    }

    

    
    
    
}
