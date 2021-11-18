/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.UUID;

/**
 *
 * @author Diksha
 */
public class Employee {
    
    private String name;
    private String id;
    private static int count = 1;
    
    public Employee() {
        this.id = UUID.randomUUID().toString();

    }

    public Employee(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
