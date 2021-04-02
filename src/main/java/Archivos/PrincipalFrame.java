/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Miky
 */
public class PrincipalFrame extends JFrame{
    
    private ControlesPanel pnlControles;
    private JColorChooser dlgColor;
    private JFileChooser dlgFile;
   
    public PrincipalFrame() {
        super("Archivos");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 180);
        super.setLayout(new FlowLayout());
        super.setLocationRelativeTo(null);
        
        dlgColor = new JColorChooser();
        dlgFile = new JFileChooser();
        pnlControles = new ControlesPanel();
        pnlControles.setListener(new ControlesInterface() {
            
            @Override
            public void abrirArchivo() {
                Integer resultado = dlgFile.showOpenDialog(pnlControles);
                if(resultado == JFileChooser.APPROVE_OPTION){
                    pnlControles.setTxArchivo(dlgFile.getSelectedFile().toString());
                }
            }

            @Override
            public void guardarNombre() {
                Integer resultado = dlgFile.showSaveDialog(pnlControles);
                if(resultado == JFileChooser.APPROVE_OPTION){
                    pnlControles.setTxGuardar(dlgFile.getSelectedFile().toString());
                }
            }

            @Override
            public void color() {
                Color color = dlgColor.showDialog(pnlControles, "Selecciona un color", pnlControles.getPnlColor());
                pnlControles.setPnlColor(color);
            }
            
        });
        
        //super.add(dlgColor);
        //super.add(dlgFile);
        super.add(pnlControles, FlowLayout.LEFT);
        super.setVisible(true);
    }

    

    public static void main(String[] args) {
        new PrincipalFrame();
    }
    
}
