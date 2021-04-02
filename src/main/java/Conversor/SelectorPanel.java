/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Miky
 */
public class SelectorPanel extends JPanel{
    private JComboBox cmbSelector;
    private SelectorInterface listener;

    public Integer getCmbSelector() {
        return cmbSelector.getSelectedIndex();
    }
    

    public SelectorPanel(){
        cmbSelector = new JComboBox();
        cmbSelector.addItem("");
        cmbSelector.addItem("De peso a dolar");
        cmbSelector.addItem("De dolar a peso");
        
        cmbSelector.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    listener.conversor();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(
                           null, 
                           ex .getMessage(), 
                           "Error de conversión",
                           JOptionPane.INFORMATION_MESSAGE);
                } 
            }
            
        });
        
        super.add(this.cmbSelector);
    }
    
    public void setListener(SelectorInterface listener) {
        this.listener = listener;
    }
    
}
