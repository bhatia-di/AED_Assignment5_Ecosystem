/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Customer.Customer;
import Business.Employee.Employee;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {

    private ArrayList<Restaurant> restaurants;
    private LocalDateTime lastUpdatedTimestamp = LocalDateTime.now();


    public RestaurantDirectory() {
        restaurants = new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestList() {
        return restaurants;
    }

    public Restaurant getRestAtIndex(int index) {

        return restaurants.get(index);

    }
     public Restaurant getRestaurantWithUserAccountId(String accId) {
        return restaurants.stream().filter(c -> c.getUserAccount().getUserAccountId().equals(accId))
                .collect(Collectors.toList()).get(0);
    
    
    
    }


    public Restaurant createRestaurant(Restaurant newRest) {

        restaurants.add(newRest);
        return newRest;

    }
    public void setLastUpdatedTimestamp(LocalDateTime lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    public void setRestaurantAtIndex(int index, Restaurant newRest) {

        restaurants.set(index, newRest);
        setLastUpdatedTimestamp(LocalDateTime.now());


    }

    public void removeRestaurantAtIndex(int index) {
        restaurants.remove(getRestAtIndex(index));
        setLastUpdatedTimestamp(LocalDateTime.now());
    }




}
