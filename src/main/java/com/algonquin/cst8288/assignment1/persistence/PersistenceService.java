/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.persistence;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author renxihai
 */
public class PersistenceService {

    /**
     * Write data into file but it violates DIP
     *
     * @param employee
     * @throws IOException
     *
     *
     */
    public void saveEmployee(Employee person, String filename, Formatter formatter) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {
            String personStr = formatter.format(person);
            writer.println(personStr);
            writer.flush();
        }
    }

}
