/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author owner
 */
public class Employee {
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
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 130) {
            throw new IllegalArgumentException();
        }
        this.age = age;
    }
    
    
    
}
