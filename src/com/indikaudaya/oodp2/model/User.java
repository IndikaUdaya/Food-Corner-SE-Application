/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.model;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author indika
 */
public class User {

    private static final Map<String, UserData> USER = new HashMap<>();

    static {
        UserData build = new UserData.Builder()
                .setAccountUserName("Indika")
                .setUserType(UserType.ADMIN.toString())
                .setPassword("123456")
                .setStatus(Status.ACTIVATE.toString())
                .build();
        USER.put("Indika", build);
    }

    public static void addUser(UserData userData) {
        if (USER.get(userData.getAccountUserName()) == null) {
            USER.put(userData.getAccountUserName(), userData);
            JOptionPane.showMessageDialog(null, "User added successfully!.", "Signup ", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Already existed user.", "Signup ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static UserData signInUser(String userName, String password) {
        UserData u = USER.get(userName);
        if (u != null && u.getPassword().equals(password)) {
            return u;
        } else {
            JOptionPane.showMessageDialog(null, "Please enter valid user name and password!.", "Sign-in ", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
