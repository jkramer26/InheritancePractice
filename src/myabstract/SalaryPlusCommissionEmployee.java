/*
 * Subclass that extends Superclass SalariedEmployee
 */

package myabstract;

public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    private double commissionRate;
    private double totalSales;
    private double commissionPay;
    private double employeePay;
    
    //constructor
    public SalaryPlusCommissionEmployee(String name, int employeeID, char gender, int age, double annualSalary, 
            double commissionRate, double totalSales) {
        super(name, employeeID, gender, age, annualSalary);
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }
    
    public double getCommissionRate() {
        return commissionRate;
    }

    public double getTotalSales() {
        return totalSales;
    }
    
    public double getCommssionPay() {
        //calculate the amount of commission pay the employee earned
        commissionPay = (commissionRate * totalSales);
        
        return commissionPay;
    }
    
    
    //method to get employee pay
    @Override
    public double getEmployeePay() {
        employeePay = (commissionPay + getAnnualSalary());
        
        return employeePay;
    }
}
