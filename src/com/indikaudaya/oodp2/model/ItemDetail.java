/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.model;

/**
 *
 * @author indika
 */
public class ItemDetail {

    private final double price;
    private final String itemName;
    private final String path;

    public ItemDetail(Builder builder) {
        this.price = builder.price;
        this.itemName = builder.itemName;
        this.path = builder.path;
    }

    public static class Builder {

        private double price;
        private String itemName;
        private String path;

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public ItemDetail build() {
            return new ItemDetail(this);
        }

    }

    public double getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "ItemDetail{" + "price=" + price + ", itemName=" + itemName + ", path=" + path + '}';
    }

}
