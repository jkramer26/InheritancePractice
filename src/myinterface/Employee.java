

package myinterface;


public interface Employee {
    
    //always be sure to use abstract keyword in interfaces
    public abstract String getName();
    public abstract void setName(String name);
    
    public abstract int getEmployeeID();
    public abstract void setEmployeeID(int age);
    
    public abstract char getGender();
    public abstract void setGender(char gender);
    
    public abstract int getAge();
    public abstract void setAge(int age);
    
    public abstract double getEmployeePay();
    
}
