/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

/**
 *
 * @author renxihai
 */
public class PermanentEmployee extends Employee {

    public PermanentEmployee() {

    }

    private double bonus;
    private double totalCompensation;
    private int numberOfServiceYear;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTotalCompensation() {
        return totalCompensation;
    }

    public void setTotalCompensation(double totalCompensation) {
        this.totalCompensation = totalCompensation;
    }

    public int getNumberOfServiceYear() {
        return numberOfServiceYear;
    }

    public void setNumberOfServiceYear(int numberOfServiceYear) {
        this.numberOfServiceYear = numberOfServiceYear;
    }

    @Override
    public String toString() {
        return "PermanentEmployee [name=" + this.getName() + ", email=" + this.getEmail() + ", address=" + this.getAddress() + ", salary=" + this.getSalary()
                + ", numberOfServiceYear=" + this.getNumberOfServiceYear() + ", bonus=" + this.getBonus() + ", totalCompensation="
                + this.getTotalCompensation() + "]";
    }

}
