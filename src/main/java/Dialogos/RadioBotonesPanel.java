/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Miky
 */
public class RadioBotonesPanel extends JPanel{
    
    private JRadioButton radioInformacion;
    private JRadioButton radioPregunta;
    private JRadioButton radioPrecaucion;
    private JRadioButton radioError;
    
    private ButtonGroup grupo;
    
    public RadioBotonesPanel(){
        super.setLayout(new GridLayout(4,1));   
        
        radioInformacion = new JRadioButton("Informacion");
        radioPregunta = new JRadioButton("Pregunta");
        radioPrecaucion = new JRadioButton("Precaución");
        radioError = new JRadioButton("Error");
        
        grupo = new ButtonGroup();
        super.add(radioInformacion);
        super.add(radioPregunta);
        super.add(radioPrecaucion);
        super.add(radioError);
               
        grupo.add(radioInformacion);
        grupo.add(radioPregunta);
        grupo.add(radioPrecaucion);
        grupo.add(radioError);
    }
    
    public boolean radioInformacionSelected(){
        return radioInformacion.isSelected();
    }
    
    public boolean radioPreguntaSelected(){
        return radioPregunta.isSelected();
    }
    
    public boolean radioPrecaucionSelected(){
        return radioPrecaucion.isSelected();
    }
    
    public boolean radioErrorSelected(){
        return radioError.isSelected();
    }
}
