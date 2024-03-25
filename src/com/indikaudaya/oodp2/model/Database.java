/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author indika
 */
public class Database {

    static final Map<String, ItemDetail> MEALS = new HashMap<>();
    static final Map<String, ItemDetail> SHORTEATS = new HashMap<>();
    static final Map<String, ItemDetail> DESSERTS = new HashMap<>();
    static final Map<String, ItemDetail> BEVERAGES = new HashMap<>();
        
    static {
        SHORTEATS.put("Fish Bun", new ItemDetail.Builder().setItemName("Fish Bun").setPrice(75).setPath("E:\\neatbeansProjects\\syzygyItemImage\\fishbun.jpg").build());
        SHORTEATS.put("Egg Bun", new ItemDetail.Builder().setItemName("Egg Bun").setPrice(100).setPath("E:\\neatbeansProjects\\syzygyItemImage\\eggbun.jpg").build());
        SHORTEATS.put("Vegetable Roti", new ItemDetail.Builder().setItemName("Vegetable Roti").setPrice(125).setPath("E:\\neatbeansProjects\\syzygyItemImage\\vegetableroti.jpg").build());
        SHORTEATS.put("Chana Kathi Roll", new ItemDetail.Builder().setItemName("Chana Kathi Roll").setPrice(175).setPath("E:\\neatbeansProjects\\syzygyItemImage\\chana_kathi_rolls.jpg").build());
    }
    
    static {
        MEALS.put("Egg Fried Rice", new ItemDetail.Builder().setItemName("Egg Fried Rice").setPrice(705).setPath("E:\\neatbeansProjects\\syzygyItemImage\\Egg Fried Rice.jpg").build());
        MEALS.put("Vegitable Fried Rice", new ItemDetail.Builder().setItemName("Vegitable Fried Rice").setPrice(655).setPath("E:\\neatbeansProjects\\syzygyItemImage\\Vegitable Fried Rice.jpg").build());
        MEALS.put("Chicken Fried Rice", new ItemDetail.Builder().setItemName("Chicken Fried Rice").setPrice(900).setPath("E:\\neatbeansProjects\\syzygyItemImage\\Chicken Fried Rice.jpg").build());
        MEALS.put("Chicken Kottu", new ItemDetail.Builder().setItemName("Chicken Kottu").setPrice(755).setPath("E:\\neatbeansProjects\\syzygyItemImage\\Chicken Kottu.jpg").build());
        MEALS.put("Cheese Pizza", new ItemDetail.Builder().setItemName("Cheese Pizza").setPrice(1055).setPath("E:\\neatbeansProjects\\syzygyItemImage\\Cheese Pizza.jpg").build());
    }
    
    static {
        BEVERAGES.put("Botteled Water 1L", new ItemDetail.Builder().setItemName("Botteled Water 1L").setPrice(175).setPath("E:\\neatbeansProjects\\syzygyItemImage\\Botteled Water 1L.jpg").build());
        BEVERAGES.put("Nescafe", new ItemDetail.Builder().setItemName("Nescafe").setPrice(150).setPath("E:\\neatbeansProjects\\syzygyItemImage\\Nescafe.jpg").build());
        BEVERAGES.put("Green Tea", new ItemDetail.Builder().setItemName("Green Tea").setPrice(200).setPath("E:\\neatbeansProjects\\syzygyItemImage\\Green Tea.jpg").build());
        BEVERAGES.put("Milo 180ml", new ItemDetail.Builder().setItemName("Milo 180ml").setPrice(155).setPath("E:\\neatbeansProjects\\syzygyItemImage\\Milo 180ml.jpg").build());
        BEVERAGES.put("Coca Cola 150mL", new ItemDetail.Builder().setItemName("Coca Cola 150mL").setPrice(1055).setPath("E:\\neatbeansProjects\\syzygyItemImage\\Coca Cola 150mL.jpg").build());
        BEVERAGES.put("Sprite 150mL", new ItemDetail.Builder().setItemName("Sprite 150mL").setPrice(200).setPath("E:\\neatbeansProjects\\syzygyItemImage\\Sprite 150mL.png").build());
    }
    
    static {
        DESSERTS.put("Jelly", new ItemDetail.Builder().setItemName("Jelly").setPrice(350).setPath("E:\\neatbeansProjects\\syzygyItemImage\\Jelly.jpg").build());
        DESSERTS.put("caramel pudding", new ItemDetail.Builder().setItemName("caramel pudding").setPrice(150).setPath("E:\\neatbeansProjects\\syzygyItemImage\\caramel pudding.jpg").build());
        DESSERTS.put("Ice Cream Scoop", new ItemDetail.Builder().setItemName("Ice Cream Scoop").setPrice(200).setPath("E:\\neatbeansProjects\\syzygyItemImage\\Ice Cream Scoop.jpg").build());
        DESSERTS.put("Wattalapan", new ItemDetail.Builder().setItemName("Wattalapanm").setPrice(255).setPath("E:\\neatbeansProjects\\syzygyItemImage\\Wattalapanm.jpg").build());
   }

    public static void setShorteats(String key, ItemDetail itemDetail) {
        SHORTEATS.put(key, itemDetail);
    }
    
    public static void setMeals(String key, ItemDetail itemDetail) {
        MEALS.put(key, itemDetail);
    }
    
    public static void setBeverage(String key, ItemDetail itemDetail) {
        BEVERAGES.put(key, itemDetail);
    }
    
    public static void setDessert(String key, ItemDetail itemDetail) {
        DESSERTS.put(key, itemDetail);
    }
    
     public Map<String,ItemDetail> getShorteats() {
       return SHORTEATS;
    }
    
    public Map<String,ItemDetail> getMeals() {
        return MEALS;
    }
    
    public  Map<String,ItemDetail> getBeverage() {
        return BEVERAGES;
    }
    
    public Map<String,ItemDetail> getDessert() {
         return DESSERTS;
    }

    
}
