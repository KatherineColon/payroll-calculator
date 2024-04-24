package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/main/resources/employees - Copy.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            boolean header = true;
           while((input = bufReader.readLine())!= null){
               if(header) {
                   header = false;
                   continue; //skips header
               }
               String[] tokens = input.split("\\|");

               int employeeId = Integer.parseInt(tokens[0]);
               String name = tokens[1];
               double hoursWorked = Double.parseDouble(tokens[2]);
               double payRate = Double.parseDouble(tokens[3]);

               Employee employee = new Employee (employeeId, name, hoursWorked, payRate);

               System.out.printf("Employee ID: %d\n",employee.getEmployeeId());
               System.out.printf("Name: %s\n", employee.getName());
               System.out.printf("Gross pay: %.2f\n", employee.getGrossPay());
               System.out.println(" ");
           }
           bufReader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}