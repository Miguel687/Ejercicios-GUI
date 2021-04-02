/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colores;


import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author Miky
 */
public class ControladoresPanel extends JPanel{
    
    private JSlider slRed;
    private JSlider slGreen;
    private JSlider slBlue;
    
    private JSpinner spRed;
    private JSpinner spGreen;
    private JSpinner spBlue;
    
    private JLabel lbRed;
    private JLabel lbGreen;
    private JLabel lbBlue;
    
    private JPanel pnlRed;
    private JPanel pnlGreen;
    private JPanel pnlBlue;
    
    private ControladoresInterface listener;

    public ControladoresPanel(){
        super.setLayout(new GridLayout(6,1));     

        slRed = new JSlider(0,255,0); //(m,M,empieza)
        slGreen = new JSlider(0,255,0);
        slBlue = new JSlider(0,255,0);
        
        ///////////////////////////ACCIONES SLIDER///////////////////////////
        slRed.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                listener.sliderRed();
            }       
        });
        
        slGreen.addChangeListener(new ChangeListener() { 
            @Override
            public void stateChanged(ChangeEvent e) {
                listener.sldierGreen();
            }  
        });
        
        slBlue.addChangeListener(new ChangeListener() { 
            @Override
            public void stateChanged(ChangeEvent e) {
                listener.sliderBlue();
            }  
        });
        
        

        spRed = new JSpinner(new SpinnerNumberModel(0,0,255, 1));
        spBlue = new JSpinner(new SpinnerNumberModel(0,0,255, 1));
        spGreen = new JSpinner(new SpinnerNumberModel(0,0,255, 1));
        
        ///////////////////////////ACCIONES SPINNER///////////////////////////
        spRed.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                listener.spinnerRed();
            }
        });
        
        spGreen.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                listener.spinnerGreen();
            }
        });
        
        spBlue.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                listener.spinnerBlue();
            }
        });
        
        super.add(slRed);
        super.add(slGreen);
        super.add(slBlue);

        super.add(spRed);
        super.add(spBlue);
        super.add(spGreen);
        
        lbRed = new JLabel("Rojo");
        super.add(lbRed);
        pnlRed = new JPanel();
        pnlRed.setLayout(new FlowLayout(FlowLayout.LEADING));
        pnlRed.add(slRed);
        pnlRed.add(spRed);
        super.add(pnlRed);
        
        lbGreen = new JLabel("Verde");
        super.add(lbGreen);
        pnlGreen = new JPanel();
        pnlGreen.setLayout(new FlowLayout(FlowLayout.LEADING));
        pnlGreen.add(slGreen);
        pnlGreen.add(spGreen);
        super.add(pnlGreen);
        
        lbBlue = new JLabel("Azul");
        super.add(lbBlue);
        pnlBlue = new JPanel();
        pnlBlue.setLayout(new FlowLayout(FlowLayout.LEADING));
        pnlBlue.add(slBlue);
        pnlBlue.add(spBlue);
        super.add(pnlBlue);
        
    }
    
    public void setListener(ControladoresInterface listener) {
        this.listener = listener;
    }
    
    public Integer getValueSlRed(){
        return slRed.getValue();
    }
    
    public Integer getValueSlGreen(){
        return slGreen.getValue();
    }
    
    public Integer getValueSlBlue(){
        return slBlue.getValue();
    }
    
    public Integer getValueSpRed(){
        return (Integer) spRed.getValue();
    }
    
    public Integer getValueSpGreen(){
        return (Integer) spGreen.getValue();
    }
    
    public Integer getValueSpBlue(){
        return (Integer) spBlue.getValue();
    }

    /////////////////////////////SETTER///////////////////////////
    public void setSlRed(Integer a) {
        this.slRed.setValue(a);
    }

    public void setSlGreen(Integer a) {
        this.slGreen.setValue(a);
    }

    public void setSlBlue(Integer a) {
        this.slBlue.setValue(a);
    }

    public void setSpRed(Integer a) {
        this.spRed.setValue(a);
    }

    public void setSpGreen(Integer a) {
        this.spGreen.setValue(a);
    }

    public void setSpBlue(Integer a) {
        this.spBlue.setValue(a);
    }
    
  
    
    
}
