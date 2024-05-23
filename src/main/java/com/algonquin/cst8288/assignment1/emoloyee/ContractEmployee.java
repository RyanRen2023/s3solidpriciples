/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

/**
 *
 * @author renxihai
 */
public class ContractEmployee extends Employee {

    @Override
    public String toString() {
        return "Employee [name=" + this.getName() + ", email=" + this.getEmail() + ", address=" + this.getAddress() + ", salary=" + this.getSalary()
                + ", renewalDate=" + this.getRenewalDate() + "]";
    }
}
