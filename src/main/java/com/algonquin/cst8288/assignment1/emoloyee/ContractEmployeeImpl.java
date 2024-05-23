/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author renxihai
 */
public class ContractEmployeeImpl implements ContractEmployeeService {

    @Override
    public Date renewalDate() {
//        f. Renewal date is only applicable for Contract Employees and is calculated 1 year from today.
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        return calendar.getTime();
    }

    @Override
    public double calculateTotalCompensation(Employee employee) {
        return employee.getSalary();
    }

}
