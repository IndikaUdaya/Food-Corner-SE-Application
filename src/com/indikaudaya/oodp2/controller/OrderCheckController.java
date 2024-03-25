/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.controller;

import com.indikaudaya.oodp2.model.OrderPool;
import com.indikaudaya.oodp2.model.Orders;

/**
 *
 * @author indika
 */
public class OrderCheckController {
    public Orders searchOrder(int orderNumber) {
        return OrderPool.getOrdersDetails(orderNumber);
    }
}
