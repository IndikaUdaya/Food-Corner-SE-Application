/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.service;

import com.indikaudaya.oodp2.model.Orders;

/**
 *
 * @author indika
 */
public class OrderProcessor {

    private StepHandler firstHandler;

    public OrderProcessor(StepHandler firstHandler) {
        this.firstHandler = firstHandler;
    }

    public void processOrder(Orders order) {
        firstHandler.handleOrder(order);
    }

}
