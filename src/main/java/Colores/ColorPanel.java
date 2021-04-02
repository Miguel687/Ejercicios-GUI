/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 *
 * @author Miky
 */
public class ColorPanel extends JPanel{
    

    
    public ColorPanel(){
        super.setLayout(new BorderLayout());
        //super.setBackground(Color.red);
        super.setBackground(new Color(0,0,0));
        super.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        super.setPreferredSize(new Dimension(50,50));


    } 
}
