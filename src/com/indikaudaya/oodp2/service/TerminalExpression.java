/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.service;

/**
 *
 * @author indika
 */
public class TerminalExpression implements AmountExpression {

    private double price;

    public TerminalExpression(double price) {
        this.price = price;
    }

    @Override
    public double amount() {
        return this.price;
    }

}
