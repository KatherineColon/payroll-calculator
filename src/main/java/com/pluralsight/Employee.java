package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;
//constructor with parameters
public Employee(int employeeId, String name, double hoursWorked, double payRate) {
    this.employeeId = employeeId;
    this.name = name;
    this.hoursWorked = hoursWorked;
    this.payRate = payRate;
}
//getters
public int getEmployeeId(){
    return employeeId;
}
public String getName() {
    return name;
}
public double getHoursWorked(){
    return hoursWorked;
}
public double getPayRate (){
    return payRate;
}
public double getGrossPay (){
    return hoursWorked * payRate;
}
}
