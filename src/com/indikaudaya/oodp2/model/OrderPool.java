/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author indika
 */
public class OrderPool {

    private static final Map<Integer, Orders> order = new HashMap<>();

    public static void addOrder(Orders orders) {
        order.put(orders.getOrderNumber(), orders);
    }

    public static Orders getOrdersDetails(int orderNumber) {
        return order.get(orderNumber);
    }

    public static Collection<Orders> getAllOrders() {
        return order.values();
    }

}
