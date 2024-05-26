package com.algonquin.cst8288.assignment1.controller;

import java.io.IOException;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.emoloyee.EmployeeService;
import com.algonquin.cst8288.assignment1.emoloyee.EmployeeServiceFactory;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.PersistenceService;

/**
 *
 * Process, validate and save employee data.
 *
 *
 */
public class EmployeeController {

    private EmployeeValidator employeeValidator = new EmployeeValidator();

    private PersistenceService persistenceService = new PersistenceService();

    public String processEmployee(Employee employee) throws IOException {

        // Process data
        // Calculate bonus, 
        // total compensation, 
        // pension contribution, 
        // renewal date etc.
        // Validate data
        EmployeeService employeeService = EmployeeServiceFactory.createService(employee);
        if (employeeService != null) {
            employeeService.populateEmployee(employee);
        }

        if (!employeeValidator.isValidEmployee(employee)) {
            return "FALIED";
        }
        EmployeeFormatter.formatString(employee);

       
        // Store data
        persistenceService.saveEmployee(employee, "json_employee_data.txt", new JSONFormatter());
        persistenceService.saveEmployee(employee, "text_employee_data.txt", new TextFormatter());

        return "SUCCESS";
    }

}
