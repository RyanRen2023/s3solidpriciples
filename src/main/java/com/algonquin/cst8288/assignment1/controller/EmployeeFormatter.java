/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.controller;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;

/**
 *
 * @author renxihai
 */
public class EmployeeFormatter {

    public static void formatString(Employee employee) {
        employee.setName(trim(employee.getName()));
        employee.setEmail(trim(employee.getEmail().trim()));
    }

    public static String trim(String str) {
        return str == null ? str : str.trim();
    }

}
