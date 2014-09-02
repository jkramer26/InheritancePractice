

package myabstract;

public abstract class Employee {
    
    private String name;
    private int employeeID;
    private char gender;
    private int age;
    
    //Constructor
    public Employee(String name, int employeeID, char gender, int age) {
        this.name = name;
        this.employeeID = employeeID;
        this.gender = gender;
        this.age = age;
    }
    
    //
    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    
    
    //abstract method to get pay
    public abstract double getEmployeePay();
    
}
