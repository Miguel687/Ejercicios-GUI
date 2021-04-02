/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colores;


import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JPanel;


/**
 *
 * @author Miky
 */
public class PrincipalFrame extends JFrame{
    
    private ControladoresPanel pnlControladores;

    public PrincipalFrame(){
        super("Colores");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 250);
        super.setLayout(new FlowLayout(FlowLayout.CENTER));
        super.setLocationRelativeTo(null);
        
        JPanel pnlColor = new JPanel();  
        pnlColor.setBackground(new Color(0,0,0)); 
        pnlColor.setPreferredSize(new Dimension(160,160));
        
        pnlControladores = new ControladoresPanel();
        
        pnlControladores.setListener(new ControladoresInterface(){
            @Override
            public void spinnerRed() {
                pnlControladores.setSlRed(pnlControladores.getValueSpRed());
                pnlColor.setBackground(new Color(pnlControladores.getValueSpRed(),
                        pnlControladores.getValueSpGreen(),
                        pnlControladores.getValueSpBlue()));
            }

            @Override
            public void spinnerGreen() {
                pnlControladores.setSlGreen(pnlControladores.getValueSpGreen());
                pnlColor.setBackground(new Color(pnlControladores.getValueSpRed(),
                       pnlControladores.getValueSpGreen(),
                       pnlControladores.getValueSpBlue()));
            }

            @Override
            public void spinnerBlue() {
                pnlControladores .setSlBlue(pnlControladores.getValueSpBlue());
                pnlColor.setBackground(new Color(pnlControladores.getValueSpRed(),
                       pnlControladores.getValueSpGreen(),
                       pnlControladores.getValueSpBlue()));
            }

            @Override
            public void sliderRed() {
                pnlControladores.setSpRed(pnlControladores.getValueSlRed());
            }

            @Override
            public void sldierGreen() {
                pnlControladores.setSpGreen(pnlControladores.getValueSlGreen());
            }

            @Override
            public void sliderBlue() {
                pnlControladores.setSpBlue(pnlControladores.getValueSlBlue());
            } 
        });
       
        super.add(pnlControladores);
        super.add(pnlColor);
        super.setVisible(true);
    }
    
    
    public static void main(String[] args) {
       new PrincipalFrame();
    }
    
}
