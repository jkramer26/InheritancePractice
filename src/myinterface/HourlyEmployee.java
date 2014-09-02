

package myinterface;


public class HourlyEmployee implements Employee {
   private String name;
   private int employeeID;
   private char gender;
   private int age;
   private double payRate;
   private double hoursWorked;
  
    public HourlyEmployee(String name, int employeeID, char gender, int age, double payRate, double hoursWorked) {
        this.name = name;
        this.employeeID = employeeID;
        this.gender = gender;
        this.age = age;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
    
    //overiding methods from employee interface
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


    @Override
    public double getEmployeePay() {
        double employeePay;
        
        //calculate hourly employees pay
        employeePay = payRate * hoursWorked;
        
        //return calculated employee pay
        return employeePay;
    }
    
    
}
