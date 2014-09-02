package inheritancepractice;


public class InterfaceStart {
    public static void main(String[] args) {
        
        //Create an hourly employee object
        myinterface.HourlyEmployee tim = new myinterface.HourlyEmployee("Tim Jim", 234, 'm', 63, 13.72, 40);
        
        //Print out informatino about hourly employee object
        System.out.println("Employee Name: " + tim.getName() 
                            + "\nEmployee ID: " + tim.getEmployeeID()
                            + "\nIs " + tim.getGender() 
                            + " and is " + tim.getAge() + " years old");
        System.out.println("Hourly Wage Rate: " + tim.getPayRate()
                            + "\nHours Worked: " + tim.getHoursWorked()
                            + "\nPaycheck Amount: " + tim.getEmployeePay() + "\n");
        
        myinterface.SalariedEmployee bob = new myinterface.SalariedEmployee("Bob Dole", 987, 'm', 32, 40000);
        System.out.println("Employee Name: " + bob.getName() 
                            + "\nEmployee ID: " + bob.getEmployeeID()
                            + "\nIs " + bob.getGender() 
                            + " and is " + bob.getAge() + " years old");
        System.out.println("Annual Salary: " + bob.getAnnualSalary() + "\n");
        
        myinterface.SalaryPlusCommissionEmployee jessica = new myinterface.SalaryPlusCommissionEmployee("Jessica Kramer", 696, 'f', 23, 40000, .10, 20000);
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
