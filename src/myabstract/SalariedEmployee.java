/*
 * Subclass that extends superclass Employee
 * 
 */

package myabstract;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    
    //constructor
     public SalariedEmployee(String name, int employeeID, char gender, int age, double annualSalary) {
        super(name, employeeID, gender, age);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }
  
    
    //method to return annual salary and override the superclass method
    @Override
    public double getEmployeePay() {
        return annualSalary;
    }
}
