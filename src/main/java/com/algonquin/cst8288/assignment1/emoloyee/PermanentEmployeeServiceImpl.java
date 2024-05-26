/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;


import com.algonquin.cst8288.assignment1.controller.Rate;

/**
 *
 * @author renxihai
 */
public class PermanentEmployeeServiceImpl implements PermanentEmployeeService {
    
   
    

    @Override
    public double calculateTotalCompensation(Employee employee) {
        //b. Total compensation is calculated as salary + bonus.
        PermanentEmployee pe = (PermanentEmployee)employee;
        return pe.getSalary() + pe.getBonus();
    }

    @Override
    public double pensionContribution(Employee employee) {
        //e. Pension contribution is 1% of base salary.
        return employee.getSalary() * Rate.PENSION_PERCENTAGE;
    }

    @Override
    public double calculateBonus(Employee employee) {
        //d. Bonus is 2.5% of base salary and calculated multiplying by the years of service.
        PermanentEmployee pe = (PermanentEmployee)employee;
        double bonus = pe.getSalary() * Rate.BONUS_PERCENTAGE * pe.getNumberOfServiceYear();
        return bonus;
    }

    @Override
    public void populateEmployee(Employee employee) {
       PermanentEmployee pe = (PermanentEmployee)employee;
       pe.setBonus(this.calculateBonus(employee));
       pe.setTotalCompensation(this.calculateTotalCompensation(employee));
    }

   


}
