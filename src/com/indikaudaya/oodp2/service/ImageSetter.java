/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.service;

import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author indika
 */
public class ImageSetter implements Serializable {

    public static void setImageToLabel(JLabel jLabel, String imageName) {
        jLabel.setIcon(new ImageIcon(new ImageIcon(imageName).getImage().getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_DEFAULT)));
    }
    
    public static void setImageToLabel(JLabel jLabel,int width,int height, String imageName) {
        jLabel.setIcon(new ImageIcon(new ImageIcon(imageName).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
    }

}
