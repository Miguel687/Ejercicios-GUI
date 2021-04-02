/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.FlowLayout;

import javax.swing.JPanel;

/**
 *
 * @author Miky
 */
public class SalirPanel extends JPanel{
    
    private JButton btnSalir;
    private SalirPanelInterface listener;

    public SalirPanel() {
        super.setLayout(new BorderLayout());
        
        btnSalir = new JButton("Salir");
        //btnSalir.setLayout(new FlowLayout(FlowLayout.RIGHT));
        btnSalir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    listener.salirButtonClick();
                } catch (Exception ex) {
                }
                
            }
            
        });
        
        super.add(this.btnSalir);
    }

    public void setListener(SalirPanelInterface listener) {
        this.listener = listener;
        
    }
    
    
    
    
}
