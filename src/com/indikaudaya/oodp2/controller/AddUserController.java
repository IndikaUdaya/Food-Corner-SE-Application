/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.controller;

import com.indikaudaya.oodp2.model.User;
import com.indikaudaya.oodp2.model.UserData;

/**
 *
 * @author indika
 */
public class AddUserController {
    public void saveUser(UserData userData){
        User.addUser(userData);
    }
}
