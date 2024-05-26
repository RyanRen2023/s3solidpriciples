/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

/**
 *
 * @author renxihai
 */
public class EmployeeServiceFactory {

    public static EmployeeService createService(Employee employee) {
        if (employee instanceof PermanentEmployee) {
            return new PermanentEmployeeServiceImpl();
        } else if (employee instanceof ContractEmployee) {
            return new ContractEmployeeServiceImpl();
        }
        return null;
    }

}

