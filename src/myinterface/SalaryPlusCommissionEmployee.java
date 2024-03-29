/*
 * Subclass that extends SalariedEmployee and implements Employee interface
 */

package myinterface;

//inherits implementation from salariedemployee so not needed to extend
public class SalaryPlusCommissionEmployee extends SalariedEmployee implements Employee {
   
   //should not need these if just extending
   private String name;
   private int employeeID;
   private char gender;
   private int age;
   private double annualSalary;
   private double commissionRate;
   private double totalSales;
   private double commissionPay;
   private double employeePay;
    
    //constructor
    public SalaryPlusCommissionEmployee(String name, int employeeID, char gender, int age, double annualSalary, 
            double commissionRate, double totalSales) {
        super(name, employeeID, gender, age, annualSalary);
        this.name = name;
        this.employeeID = employeeID;
        this.gender = gender;
        this.age = age;
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }
    
    public double getCommissionRate() {
        return commissionRate;
    }

    public double getTotalSales() {
        return totalSales;
    }
    
    public double getCommissionPay() {
        //calculate the amount of commission pay the employee earned
        commissionPay = (commissionRate * totalSales);
        
        return commissionPay;
    }
    
    /** DON'T NEED ALL THESE BECAUSE THEY ARE INHERITED
    //overriding methods from employee interface
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
    */

    @Override
    public double getEmployeePay() {
        employeePay = (commissionPay + getAnnualSalary());
        
        return employeePay;
    }
    
}
