/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.UUID;

/**
 *
 * @author harold
 */
public class Customer {
    
    
    
    private String customerId;
    private String name;
    private int age;
   private String address;
    private UserAccount userAccount;

    public Customer() {
        this.customerId = UUID.randomUUID().toString();
    }

    public Customer( Customer cust, String username, String password) {
    
        this.customerId = cust.getPersonId();
        this.name = cust.getName();
        this.age = cust.getAge();
        this.address = cust.getAddress();
        this.userAccount = new UserAccount();
       
    
    }
    public Customer(String name, int age, String address) {
        this.customerId = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
    * Accept DOB/ Gender/ phone
    * */

    public String getPersonId() {
        return customerId;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userName, String password, String name ) {
        this.userAccount.setUsername(userName);
        this.userAccount.setPassword(password);
        //this.userAccount.setEmployee(new Employee(name));
    }

    public void setUserAccount(String userName, String password, String name, Role role) {
        this.userAccount.setUsername(userName);
        this.userAccount.setPassword(password);
        this.userAccount.setRole(role);
        //this.userAccount.setEmployee(new Employee(name));
    }

    public void setUserAccount(UserAccount userAccount) {
       this.userAccount = userAccount;
        //this.userAccount.setEmployee(new Employee(name));
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
