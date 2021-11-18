/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author 18577
 */
public class House {
    private String community;
    private String city;
    private int zipcode;

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    private String address;
    
    
    

    public House(String community, String city, int zipcode, String address) {
        this.community = community;
        this.city = city;
        this.zipcode = zipcode;
        this.address = address;
    }
    
    
}
