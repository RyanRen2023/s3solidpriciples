/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

/**
 *
 * @author renxihai
 */
public interface PermanentEmployeeService extends EmployeeService {

    public double calculateTotalCompensation(Employee employee);

    public double pensionContribution(Employee employee);

    public double calculateBonus(Employee employee);

}
