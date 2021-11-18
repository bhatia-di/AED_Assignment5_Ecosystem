/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee(name);
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }

    public void setEmployeeName(String employeeName, String ID) {
        Employee updateEmp = employeeList.stream().filter(employee -> employee.getId().equals(ID))
                .collect(Collectors.toList())
                .get(0);
        updateEmp.setName(employeeName);

    }
}