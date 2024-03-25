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
public abstract class StepHandler {

    protected StepHandler handler;

    protected abstract boolean canHandle(Orders order);

    protected abstract void processOrder(Orders order);

    private StepHandler nextHandler;

    public void setNext(StepHandler handler) {
        this.nextHandler = handler;
    }

    public void handleOrder(Orders order) {
        if (canHandle(order)) {
            processOrder(order);
        } else if (nextHandler != null) {
            nextHandler.handleOrder(order);
        } else {
            System.out.println("no other handler -> Error");
        }
    }
}
