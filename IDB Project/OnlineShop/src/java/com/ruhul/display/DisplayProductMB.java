/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhul.display;

import com.ruhul.dao.ListDao;
import com.ruhul.entity.Product;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Ruhul-Pc
 */
@ManagedBean
@SessionScoped
public class DisplayProductMB {

    Product product = new Product();
    private Product selectedProduct;

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getAllProduct() {
        List<Product> plist = new ListDao().allProductList();
        return plist;
    }
}