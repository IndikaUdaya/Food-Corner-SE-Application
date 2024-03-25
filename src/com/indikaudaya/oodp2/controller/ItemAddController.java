/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.controller;

import com.indikaudaya.oodp2.model.Database;
import com.indikaudaya.oodp2.model.ItemDetail;
import com.indikaudaya.oodp2.service.ClearUserPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author indika
 */
public class ItemAddController {
    
    ClearUserPanel clearUserPanel;

    public ItemAddController(ClearUserPanel clearUserPanel) {
        this.clearUserPanel = clearUserPanel;
    }
            
    public void addItem(String foodType, ItemDetail build) {
        switch (foodType) {
            case "Meals":
                Database.setMeals(build.getItemName(), build);
                break;
            case "Beverage":
                Database.setBeverage(build.getItemName(), build);
                break;
            case "Dessert":
                Database.setDessert(build.getItemName(), build);
                break;
            case "Short-Eats":
                Database.setShorteats(build.getItemName(), build);
                break;
            default:
                break;
        }
        clearUserPanel.clear();
    }
    
}
