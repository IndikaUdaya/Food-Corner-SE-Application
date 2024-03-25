/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.controller;

import com.indikaudaya.oodp2.model.OrderEnum;
import com.indikaudaya.oodp2.model.Status;
import com.indikaudaya.oodp2.model.UserType;
import com.indikaudaya.oodp2.service.LoadData;

/**
 *
 * @author indika
 */
public class LoadDefaultDataController {

    private LoadData loadData;

    public LoadDefaultDataController(LoadData loadData) {
        this.loadData = loadData;
    }

    public void loadUserTypeData() {
        loadData.loadUserType(UserType.values());
    }

    public void loadUserStatusData() {
        loadData.loadUserStatus(Status.values());
    }

    public OrderEnum[] loadOrderStatus() {
        return OrderEnum.values();
    }

}
