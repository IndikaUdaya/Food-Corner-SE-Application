/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.service;

import com.indikaudaya.oodp2.model.Status;
import com.indikaudaya.oodp2.model.UserType;

/**
 *
 * @author indika
 */
public interface LoadData {

    public void loadUserType( UserType[] userType);
    public void loadUserStatus(Status[] status);
}
