/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    
    private ArrayList<Customer> customers;
    private LocalDateTime lastUpdatedTimestamp = LocalDateTime.now();

    public CustomerDirectory() {
        customers = new ArrayList<Customer>();
        initPersonDirectory();
      
   }
    
    private void initPersonDirectory() {
    
//        customers.add(new Customer("Paul", 25, "Fenway", "Boston", 9088, "Fenway"));
//        customers.add(new Customer("John", 67, "Fenway", "Boston", 9088, "Fenway"));
//        customers.add(new Customer("Brain", 75, "Roxbury", "Boston", 9088, "Fenway"));
//        customers.add(new Customer("Kelly", 5, "Bolyston", "Boston", 9088, "Fenway"));
    
    
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    
    public Customer getCustomerWithUserAccountId(String accId) {
        return customers.stream().filter(c -> c.getUserAccount().getUserAccountId().equals(accId))
                .collect(Collectors.toList()).get(0);
    
    
    
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
        setLastUpdatedTimestamp(LocalDateTime.now());
    }

    public String getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp.toString();
    }

    public void setLastUpdatedTimestamp(LocalDateTime lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }


    public int getTotalPersonCount() {

        return getCustomers().size();

    }


    public Customer getPersonAtIndex(int index) {

        return customers.get(index);

    }
    
    
 public Customer createCustomer(String name,int age, String address, long phoneNumber, UserAccount userAccount){
        Customer c = new Customer();
        c.setName(name);
        c.getAge();
        customers.add(c);  
        return c;
    }
    
 
 public Customer createCustomer(Customer newCustomer) {
 
 customers.add(newCustomer);
 return newCustomer;
 
 }

    public void setPersonAtIndex(int index, Customer newPerson) {

        customers.set(index, newPerson);
        setLastUpdatedTimestamp(LocalDateTime.now());


    }

    public void removePersonAtIndex(int index) {
        customers.remove(getPersonAtIndex(index));
        setLastUpdatedTimestamp(LocalDateTime.now());
    }
    
}
