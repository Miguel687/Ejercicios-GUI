/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/**
 *
 * @author Miky
 */
public class CheckBoxPanel extends JPanel{
    private JCheckBox cbBarbilla;
    private JCheckBox cbLentes;
    private JCheckBox cbCabello;
    private JCheckBox cbDientes;
    
    private CheckBoxListener listener;

    public CheckBoxPanel() {
        super.setLayout(new GridLayout(4,1,0,18));
        
        cbBarbilla = new JCheckBox("Barbilla");
        cbLentes = new JCheckBox("Lentes");
        cbCabello = new JCheckBox("Cabello");
        cbDientes = new JCheckBox("Dientes");
        
        cbBarbilla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.checkBarbilla();
            }
        });
        
        cbLentes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.checkLentes();
            }
        });
        
        cbCabello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.checkCabello();
            }
        });
        
        cbDientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.checkDientes();
            }
        });
        
        super.add(cbBarbilla);
        super.add(cbLentes);
        super.add(cbCabello);
        super.add(cbDientes);
    }

    public void setListener(CheckBoxListener listener) {
        this.listener = listener;
    }
    
    public boolean isSelectBarbilla(){
        return cbBarbilla.isSelected();
    }
    
    public boolean isSelectLentes(){
        return cbLentes.isSelected();
    }
    
    public boolean isSelectCabello(){
        return cbCabello.isSelected();
    }
    
    public boolean isSelectDientes(){
        return cbDientes.isSelected();
    }
    
    
}
