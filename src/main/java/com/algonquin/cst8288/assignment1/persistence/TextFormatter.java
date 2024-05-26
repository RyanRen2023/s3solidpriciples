package com.algonquin.cst8288.assignment1.persistence;

import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployee;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployee;
import java.io.IOException;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author renxihai
 */
public class TextFormatter implements Formatter {

    /**
     *
     * this method is responsible for saving the Employee object as key-value
     * pairs, such as (name=xxxx, email=xyz@abc.com)
     *
     * @param employee
     * @return formatted String.
     * @throws IOException
     */
    @Override
    public String format(Employee employee) throws IOException {
        String format;

        if (employee instanceof PermanentEmployee) {
            PermanentEmployee pe = (PermanentEmployee) employee;
            format = "(name=%s,email=%s,address=%s,salary=%.2f,numberOfServiceYear=%d,bonus=%.2f,totalCompensation=%.2f)";
            return String.format(format, pe.getName(), employee.getEmail(), employee.getAddress(), employee.getSalary(),
                    pe.getNumberOfServiceYear(), pe.getBonus(), pe.getTotalCompensation());
        } else if (employee instanceof ContractEmployee) {
            Date renewDate = ((ContractEmployee) employee).getRenewalDate();
            format = "(name=%s,email=%s,address=%s,salary=%.2f,renewalDate=%tb %te, %tY)";
            return String.format(format, employee.getName(), employee.getEmail(), employee.getAddress(), employee.getSalary(), renewDate, renewDate, renewDate);
        } else {
            format = "(name=%s,email=%s,address=%s,salary=%.2f)";
            return String.format(format, employee.getName(), employee.getEmail(), employee.getAddress(), employee.getSalary());
        }

    }

}
