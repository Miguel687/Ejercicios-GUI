/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/**
 *
 * @author Miky
 */
public class DialogosPanel extends JPanel{
    
    private JColorChooser dlgColor;
    private JFileChooser dlgFile;

    public DialogosPanel() {
        dlgColor = new JColorChooser();
        dlgFile = new JFileChooser();
        
        super.add(dlgColor);
        super.add(dlgFile);
    }

    public JColorChooser getDlgColor() {
        return dlgColor;
    }

    public JFileChooser getDlgFile() {
        return dlgFile;
    }
    
    
}
