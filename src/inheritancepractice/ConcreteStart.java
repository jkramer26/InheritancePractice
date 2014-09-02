package inheritancepractice;

import my.concrete.*;

public class ConcreteStart {
    public static void main(String[] args) {
        //Create an Employee object
        my.concrete.Employee susan = new my.concrete.Employee("Susan Sue", 123, 'f', 33);
        
        //Print out information about employee object
        System.out.println("Employee Name: " + susan.getName() 
                            + "\nEmployee ID: " + susan.getEmployeeID()
                            + "\nIs " + susan.getGender() 
                            + " and is " + susan.getAge() + " years old\n");
        
        //Create an hourly employee object
        my.concrete.HourlyEmployee tim = new my.concrete.HourlyEmployee("Tim Jim", 234, 'm', 63, 13.72, 40);
        
        //Print out informatino about hourly employee object
        System.out.println("Employee Name: " + tim.getName() 
                            + "\nEmployee ID: " + tim.getEmployeeID()
                            + "\nIs " + tim.getGender() 
                            + " and is " + tim.getAge() + " years old");
        System.out.println("Hourly Wage Rate: " + tim.getPayRate()
                            + "\nHours Worked: " + tim.getHoursWorked()
                            + "\nPaycheck Amount: " + tim.getEmployeePay() + "\n");
        
        my.concrete.SalariedEmployee bob = new my.concrete.SalariedEmployee("Bob Dole", 987, 'm', 32, 40000);
        System.out.println("Employee Name: " + bob.getName() 
                            + "\nEmployee ID: " + bob.getEmployeeID()
                            + "\nIs " + bob.getGender() 
                            + " and is " + bob.getAge() + " years old");
        System.out.println("Annual Salary: " + bob.getAnnualSalary());
        
        my.concrete.SalaryPlusCommissionEmployee jessica = new my.concrete.SalaryPlusCommissionEmployee("Jessica Kramer", 696, 'f', 23, 40000, .10, 20000);
        System.out.println("Employee Name: " + jessica.getName() 
                            + "\nEmployee ID: " + jessica.getEmployeeID()
                            + "\nIs " + jessica.getGender() 
                            + " and is " + jessica.getAge() + " years old");
        System.out.println("Annual Salary: " + jessica.getAnnualSalary()
                            + "\nCommission Rate: " + jessica.getCommissionRate()
                            + "\nTotal Sales: " + jessica.getTotalSales()
                            + "\nAnnual salary plus commission salary: " + jessica.getEmployeePay());
        
        
        
        
    }
}
