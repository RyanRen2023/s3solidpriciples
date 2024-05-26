/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

/**
 *
 * @author renxihai
 */
public class ContractEmployee extends Employee {

    private Date renewalDate;

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    @Override
    public String toString() {
        return "ContractEmployee  [name=" + this.getName() + ", email=" + this.getEmail() + ", address=" + this.getAddress() + ", salary=" + this.getSalary()
                + ", renewalDate=" + this.getRenewalDate() + "]";
    }
}
