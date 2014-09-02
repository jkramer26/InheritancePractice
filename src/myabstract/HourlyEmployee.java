/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;


public class HourlyEmployee extends Employee {
    private double payRate;
    private double hoursWorked;
    
    //Constructor that accepts name, employeeID, gender, and age as arguments
    public HourlyEmployee(String name, int employeeID, char gender, int age) {
        super(name, employeeID, gender, age);
    }
    
    //method that will set the employees payrate
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    
    //method that will set the number of hours the employee worked
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    //returns employee pay 
    @Override
    public double getEmployeePay() {
        double employeePay;
        
        //calculate hourly employees pay
        employeePay = payRate * hoursWorked;
        
        //return calculated employee pay
        return employeePay;
    }
    
}
