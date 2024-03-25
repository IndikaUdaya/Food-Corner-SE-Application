/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.service;

import com.indikaudaya.oodp2.model.OrderEnum;
import com.indikaudaya.oodp2.model.Orders;

/**
 *
 * @author indika
 */
public class PackingStepHandler extends StepHandler{

    @Override
    protected boolean canHandle(Orders order) {
        return order.getCurrentStep() == OrderEnum.PACKING;
    }

    @Override
    protected void processOrder(Orders order) {
        order.setCurrentStep(OrderEnum.HANDOVER);
    }
}
