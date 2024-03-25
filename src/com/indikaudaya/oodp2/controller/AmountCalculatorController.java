/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.controller;

import com.indikaudaya.oodp2.service.AmountExpression;
import com.indikaudaya.oodp2.service.AmountSetter;
import com.indikaudaya.oodp2.service.NonTerminalExpression;
import com.indikaudaya.oodp2.service.TerminalExpression;
import java.util.List;

/**
 *
 * @author indika
 */
public class AmountCalculatorController {

    private final AmountSetter amountSetter;

    public AmountCalculatorController(AmountSetter amountSetter) {
        this.amountSetter = amountSetter;
    }

    private void setAmount(double amount) {
        amountSetter.setValues(amount);
    }

    public void calculateAmount(List expression) {
        AmountExpression total = new TerminalExpression(Double.parseDouble(expression.get(0).toString()));

        for (int i = 0; i < expression.size(); i++) {
            if (expression.get(i).equals("+")) {
                total = new NonTerminalExpression(total, new TerminalExpression(Double.parseDouble(expression.get(i + 1).toString())));
            }
        }
        setAmount(total.amount());
    }

}
