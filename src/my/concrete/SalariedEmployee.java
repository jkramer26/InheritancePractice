
package my.concrete;
 
public class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, int employeeID, char gender, int age, double annualSalary) {
        super(name, employeeID, gender, age);
        this.annualSalary = annualSalary;
    }
    
    public double getEmployeeSalary() {
        return annualSalary;
    }
}
