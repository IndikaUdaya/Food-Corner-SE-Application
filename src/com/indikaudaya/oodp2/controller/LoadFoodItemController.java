/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.controller;

import com.indikaudaya.oodp2.model.Database;
import com.indikaudaya.oodp2.view.CustomerHome;

/**
 *
 * @author indika
 */
public class LoadFoodItemController {
    
    private CustomerHome customerHome;
    private Database database;

    public LoadFoodItemController(CustomerHome customerHome, Database database) {
        this.customerHome = customerHome;
        this.database = database;
    }

    public void setCustomerHome(CustomerHome customerHome) {
        this.customerHome = customerHome;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
    
     public void updateMealsView() {
        customerHome.setFoodItem(database.getMeals(),"MEALS");
    }
     
     public void updateShorteatsView() {
        customerHome.setFoodItem(database.getShorteats(),"SHORT-EATS");
    }   
     
     public void updateBeverageView() {
        customerHome.setFoodItem(database.getBeverage(),"BEVERAGES");
    } 
     
     public void updateDessertsView() {
        customerHome.setFoodItem(database.getDessert(),"DESSERTS");
    } 
               
}
