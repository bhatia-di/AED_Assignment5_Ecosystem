/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String restId;
    private String restName;
    private String restLocation;
    private Long phoneNumber;
    private ArrayList<MenuItem> menulist;
    private List<String> cuisine;
    private String managerName;
    private UserAccount userAccount;


    public Restaurant() {
        restId = UUID.randomUUID().toString();
        menulist = new ArrayList<MenuItem>();
        cuisine = new ArrayList<>();
    }


    public String getRestId() {
        return restId;
    }



    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestLocation() {
        return restLocation;
    }

    public void setRestLocation(String restLocation) {
        this.restLocation = restLocation;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public ArrayList<MenuItem> getMenulist() {
        return menulist;
    }

    public void setMenulist(ArrayList<MenuItem> menulist) {
        this.menulist = menulist;
    }

    public void addMenuItem(String item, int price) {
        menulist.add(new MenuItem(item, price));
    }
    public void removeMenuItem(int index) {
        menulist.remove(index);
    }

    public List<String> getCuisine() {
        return cuisine;
    }

    public void setCuisine(List<String> cuisine) {
        this.cuisine = cuisine;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
}
