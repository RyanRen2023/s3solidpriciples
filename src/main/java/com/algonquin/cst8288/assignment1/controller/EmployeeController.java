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

    /**
     * Validator for employee data.
     */
    private EmployeeValidator employeeValidator = new EmployeeValidator();
    /**
     * Service for persisting employee data.
     */
    private PersistenceService persistenceService = new PersistenceService();

    /**
     * Processes the given employee's data, validates it, and saves it in JSON
     * and text formats.
     * <p>
     * This method performs the following steps:
     * <ul>
     * <li>Calculates additional attributes such as bonus, total compensation,
     * pension contribution, and renewal date.</li>
     * <li>Validates the employee data.</li>
     * <li>Saves the validated data in JSON and text formats.</li>
     * </ul>
     * </p>
     *
     * @param employee the employee whose data is to be processed
     * @return "SUCCESS" if the data is processed and saved successfully,
     * otherwise "FAILED"
     * @throws IOException if an I/O error occurs during data saving
     */
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
