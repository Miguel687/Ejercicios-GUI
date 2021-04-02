/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import Dialogos.BotonesInterface;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Miky
 */
public class BotonPanel extends JPanel{
    private JButton btnGenerar;
    
    private BotonesInterface listener;

    public void setListener(BotonesInterface listener) {
        this.listener = listener;
    }

    public BotonPanel() {
        super.setLayout(new GridLayout(2,1, 10, 20));
        
        btnGenerar = new JButton("Generar");
        btnGenerar.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.generar();
            }
            
        });
        
        super.add(btnGenerar);
    }

}
