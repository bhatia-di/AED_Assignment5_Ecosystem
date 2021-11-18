/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {

    private ArrayList<DeliveryMan> delAGents;
    private LocalDateTime lastUpdatedTimestamp = LocalDateTime.now();


    public DeliveryManDirectory() {
        delAGents = new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDelAgents() {
        return delAGents;
    }

    public DeliveryMan getDelAgentAtIndex(int index) {

        return delAGents.get(index);

    }

    public DeliveryMan createDelAgent(DeliveryMan newDeliveryMan) {

        delAGents.add(newDeliveryMan);
        return newDeliveryMan;

    }
    public void setLastUpdatedTimestamp(LocalDateTime lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    public void setDelAGentAtIndex(int index, DeliveryMan newDeliveryMan) {

        delAGents.set(index, newDeliveryMan);
        setLastUpdatedTimestamp(LocalDateTime.now());


    }

    public void removeDelAgentAtIndex(int index) {
        delAGents.remove(getDelAgentAtIndex(index));
        setLastUpdatedTimestamp(LocalDateTime.now());
    }



}
