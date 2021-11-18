/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.UserAccount.UserAccount;

import java.util.UUID;

/**
 *
 * @author harold
 */
public class DeliveryMan {

    private String delAgentId;
    private String name;
    private Long phoneNumber;
    private UserAccount userAccount;

    public DeliveryMan() {
        delAgentId = UUID.randomUUID().toString();
    }


    public String getDelAgentId() {
        return delAgentId;
    }

    public void setDelAgentId(String delAgentId) {
        this.delAgentId = delAgentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
}
