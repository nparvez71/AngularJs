package com.ruhul.entity;
// Generated Feb 1, 2018 1:50:08 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * DeliveryCost generated by hbm2java
 */
public class DeliveryCost  implements java.io.Serializable {


     private Integer deliveryId;
     private String zoneName;
     private double delivaryCost;
     private Set proOrders = new HashSet(0);

    public DeliveryCost() {
    }

	
    public DeliveryCost(String zoneName, double delivaryCost) {
        this.zoneName = zoneName;
        this.delivaryCost = delivaryCost;
    }
    public DeliveryCost(String zoneName, double delivaryCost, Set proOrders) {
       this.zoneName = zoneName;
       this.delivaryCost = delivaryCost;
       this.proOrders = proOrders;
    }
   
    public Integer getDeliveryId() {
        return this.deliveryId;
    }
    
    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }
    public String getZoneName() {
        return this.zoneName;
    }
    
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }
    public double getDelivaryCost() {
        return this.delivaryCost;
    }
    
    public void setDelivaryCost(double delivaryCost) {
        this.delivaryCost = delivaryCost;
    }
    public Set getProOrders() {
        return this.proOrders;
    }
    
    public void setProOrders(Set proOrders) {
        this.proOrders = proOrders;
    }




}


