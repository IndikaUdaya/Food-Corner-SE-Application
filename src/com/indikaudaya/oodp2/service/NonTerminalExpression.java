/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.service;

/**
 *
 * @author indika
 */
public class NonTerminalExpression implements AmountExpression {

    AmountExpression expression1;
    AmountExpression expression2;

    public NonTerminalExpression(AmountExpression expression1, AmountExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public double amount() {
        return expression1.amount() + expression2.amount();
    }

}
