/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhul.dao;

import com.ruhul.entity.Category;
import com.ruhul.entity.Product;
import com.ruhul.entity.SubCategory;
import com.ruhul.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ruhul-Pc
 */
public class AddDao {

    public boolean addCategory(Category cat) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(cat);
            session.getTransaction().commit();
            session.close();
            return true;
        } 
        catch (Exception e) {
            return false;
        }
    }
    
    public boolean addSubCategory(SubCategory subcat) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(subcat);
            session.getTransaction().commit();
            session.close();
            return true;
        } 
        catch (Exception e) {
            return false;
        }
    }
    
    public boolean addProduct(Product product) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
            session.close();
            return true;
        } 
        catch (Exception e) {
            return false;
        }
    }
}
