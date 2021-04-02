/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Miky
 */
public class ControlesPanel extends JPanel{
    
    private JLabel lbArchivo;
    private JLabel lbGuardar;
    private JLabel lbColor;
    
    private JTextField txArchivo;
    private JTextField txGuardar;
    private JPanel pnlColor;
    
    private JButton btnArchivo;
    private JButton btnGuardar;
    private JButton btnColor;
    
    private ControlesInterface listener;

    public ControlesPanel() {
        super.setLayout(new GridLayout(3,3,30,20));
        
        lbArchivo = new JLabel("Adjuntar archivo:");
        lbGuardar = new JLabel("Guardar:");
        lbColor = new JLabel("Color:");
        
        txArchivo = new JTextField();
        txGuardar = new JTextField();
        pnlColor = new JPanel();
        
        btnArchivo = new JButton("...");
        btnGuardar = new JButton("...");
        btnColor = new JButton("...");
        
        btnArchivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.abrirArchivo();
            } 
        });
        
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.guardarNombre();
            } 
        });
        
        btnColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.color();
            } 
            
        });
        
        super.add(lbArchivo);
        super.add(txArchivo);
        super.add(btnArchivo);
        
        super.add(lbGuardar);
        super.add(txGuardar);
        super.add(btnGuardar);
        
        super.add(lbColor);
        super.add(pnlColor);
        super.add(btnColor);
    }
    
    public void setListener(ControlesInterface listener) {
        this.listener = listener;
    }

    public void setTxGuardar(String a) {
        txGuardar.setText(a);
    }

    public void setTxArchivo(String a) {
        txArchivo.setText(a);
    }
    
    public void setPnlColor(Color a){
        pnlColor.setBackground(a);
    }

    public Color getPnlColor() {
        return pnlColor.getBackground();
    }
    
    
}
