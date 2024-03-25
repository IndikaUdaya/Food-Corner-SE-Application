/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.model;

import java.util.Map;

/**
 *
 * @author indika
 */
public class Orders {

    private final int orderNumber;
    private final String customerName;
    private final String mobile;
    private final double amount;
    private final Map<String, ItemListPanel> orderItem;
    private OrderEnum currentStep = OrderEnum.PENDING;

    private Orders(Builder builder) {
        this.orderNumber = builder.orderNumber;
        this.customerName = builder.customerName;
        this.mobile = builder.mobile;
        this.amount = builder.amount;
        this.orderItem = builder.orderItem;
    }

    public static class Builder {

        private int orderNumber;
        private String customerName;
        private String mobile;
        private double amount;
        private Map<String, ItemListPanel> orderItem;

        public Builder setOrderNumber(int orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        public Builder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setOrderItem(Map<String, ItemListPanel> orderItem) {
            this.orderItem = orderItem;
            return this;
        }

        public Orders build() {
            return new Orders(this);
        }

    }

    public Map<String, ItemListPanel> getOrderItem() {
        return orderItem;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMobile() {
        return mobile;
    }

    public double getAmount() {
        return amount;
    }

    public OrderEnum getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(OrderEnum orderEnum) {
        this.currentStep = orderEnum;
    }

    @Override
    public String toString() {
        return "Orders{" + "orderNumber=" + orderNumber + ", customerName=" + customerName + ", mobile=" + mobile + ", amount=" + amount + ", orderItem=" + orderItem + '}';
    }

}
