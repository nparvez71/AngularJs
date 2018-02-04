/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhul.cart;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class ShoppingCart {
    private List<Item> cart = new ArrayList<>();
    private double total;
    int cartsize;
    String item = "item";
    
    public String getItem(){
        if(cartsize > 1){
            item = "items";
        }
        return item;
    }

    public List<Item> getCart() {
        return cart;
    }

    public void setCart(List<Item> cart) {
        this.cart = cart;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCartsize() {
        return cartsize;
    }

    public void setCartsize(int cartsize) {
        this.cartsize = cartsize;
    }
}
