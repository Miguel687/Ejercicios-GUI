/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Miky
 */
public class CantidadPanel extends JPanel{
    
    private JLabel label;
    private JLabel cantidad;
    private JTextField capture;
    
    private JPanel pnlCantidad;
    
    public CantidadPanel(){
        super.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        this.label = new JLabel("Cantidad: ");
        this.cantidad =  new JLabel("$ 0.00");
        this.cantidad.setFont(new Font("Serif", Font.PLAIN, 30));
        this.capture = new JTextField(20);
        
        this.pnlCantidad = new JPanel();
        this.pnlCantidad.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnlCantidad.add(this.cantidad);
        
        
        super.add(this.label, BorderLayout.EAST);

        super.add(this.capture, BorderLayout.EAST);
        super.add(pnlCantidad, BorderLayout.WEST);
    }

    public Double getCantidad() throws NumeroIncorrecto{
        try {
            Double cantidad = Double.parseDouble(capture.getText());
            return cantidad;
        } catch (Exception e) {
            this.cantidad.requestFocus();
            throw new NumeroIncorrecto("Numero incorrecto, vuelva a ingresar un valor correcto");
        }       
    }
    
    public void setText(Double a) throws NumeroIncorrecto{
        try {
            this.cantidad.setText("$ "+a.toString());
        } catch (Exception e) {
            this.cantidad.requestFocus();
            throw new NumeroIncorrecto("Numero incorrecto, vuelva a ingresar un valor correcto");
        }
        
    }


    
}
