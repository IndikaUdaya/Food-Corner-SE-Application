/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.controller;

import com.indikaudaya.oodp2.model.OrderEnum;
import com.indikaudaya.oodp2.model.OrderPool;
import com.indikaudaya.oodp2.model.Orders;
import com.indikaudaya.oodp2.service.CookingStepHandler;
import com.indikaudaya.oodp2.service.HandoverStepHandler;
import com.indikaudaya.oodp2.service.OrderProcessor;
import com.indikaudaya.oodp2.service.PackingStepHandler;
import com.indikaudaya.oodp2.service.StepHandler;

/**
 *
 * @author indika
 */
public class UpdateOrderStatusController {

    StepHandler cookingHandler = new CookingStepHandler();
    StepHandler packingHandler = new PackingStepHandler();
    StepHandler handoverHandler = new HandoverStepHandler();

    public UpdateOrderStatusController() {
        cookingHandler.setNext(packingHandler);
        packingHandler.setNext(handoverHandler);
    }

    public void updateOrderStatusAsCooking(int orderNumber) {
        OrderProcessor orderProcessor = new OrderProcessor(cookingHandler);
        Orders order = OrderPool.getOrdersDetails(orderNumber);
        order.setCurrentStep(OrderEnum.COOKING);
    }

    public void updateOrderStatusAsPacking(int orderNumber) {
        Orders order = OrderPool.getOrdersDetails(orderNumber);
        order.setCurrentStep(OrderEnum.PACKING);
    }

    public void updateOrderStatusAsHandOvered(int orderNumber) {
        Orders order = OrderPool.getOrdersDetails(orderNumber);
        order.setCurrentStep(OrderEnum.HANDOVER);
    }

}
