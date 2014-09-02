
package my.concrete;
 
public class SalariedEmployee extends Employee {
    private double annualSalary;
    
    public SalariedEmployee(String name, int employeeID, char gender, int age, double annualSalary) {
        super(name, employeeID, gender, age);
        this.annualSalary = annualSalary;
    }
    
    public double getAnnualSalary() {
        return annualSalary;
    }
    
    //will return what a salaried employee makes per month
    public double getEmployeeSalary() {
        return annualSalary;
    }
}
