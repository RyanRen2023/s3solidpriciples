package com.algonquin.cst8288.assignment1.controller;

import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployee;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployee;
import java.io.IOException;

/**
 *
 * Main class to execute the application
 *
 */
public class Main {

    public static void main(String[] args) throws IOException {

        // Instantiate two Employee objects and 
        //use PermanentEmployeeService.java and ContractEmployeeService.java to calculate and populate required data for objects
        // Utilize EmployeeController.java to save both objects in JSON and Text formats, 
        // saving the data in files named json_employee_data.txt and text_employee_data.txt.
        // Do the same thing to output the data to the console instead of saving it to a file.
        System.out.println("Begin to run main class");
        PermanentEmployee pEmployee = new PermanentEmployee();

        pEmployee.setName("PermanentEmployee");
        pEmployee.setEmail("pEmployee@gmail.com");
        pEmployee.setAddress("8700 woodroffe");
        pEmployee.setSalary(100000.0);
        pEmployee.setNumberOfServiceYear(5);
        System.out.println(pEmployee.toString());

        ContractEmployee cEmployee = new ContractEmployee();
        cEmployee.setName("ContractEmployee");
        cEmployee.setEmail("pEmployee@gmail.com");
        cEmployee.setAddress("8700 woodroffe");
        cEmployee.setSalary(100000.0);
        System.out.println(cEmployee.toString());
        
        

        EmployeeController employeeController = new EmployeeController();
        employeeController.processEmployee(pEmployee);
        employeeController.processEmployee(cEmployee);
        
        System.out.println("finish  run main class");

    }

}
