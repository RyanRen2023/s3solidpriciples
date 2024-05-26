/*
 * Student Name: Xihai Ren
 * Student No: 041127486
 * Professor: George Kriger
 * Due Date: 2024/06/02
 * Description: Assignment 1
 */
package com.algonquin.cst8288.assignment1.controller;

import java.io.IOException;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.emoloyee.EmployeeService;
import com.algonquin.cst8288.assignment1.emoloyee.EmployeeServiceFactory;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.PersistenceService;

/**
 * Processes, validates, and saves employee data.
 * <p>
 * This class handles the processing of employee data including calculating
 * additional attributes such as bonus, total compensation, pension
 * contribution, and renewal date. It also validates the data and saves it in
 * different formats.
 * </p>
 *
 * @see Employee
 * @see EmployeeService
 * @see EmployeeServiceFactory
 * @see PersistenceService
 * @see JSONFormatter
 * @see TextFormatter
 *
 * @version 1.0.0
 * @since Oracle 17.0.11
 *
 * @author Xihai Ren
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
