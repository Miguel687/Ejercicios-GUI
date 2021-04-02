/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Miky
 */
public class PrincipalFrame extends JFrame{
    
    private CantidadPanel pnlCantidad;
    private SalirPanel pnlSalir;
    private SelectorPanel pnlSelector;
    
    public static final Double DOLAR = 20.71;


    public PrincipalFrame(){
        super("Conversor");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(600, 200);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        
        pnlCantidad = new CantidadPanel();
        
        pnlSelector = new SelectorPanel();
        pnlSelector.setListener(new SelectorInterface() {
            @Override
            public void conversor() {
                try {
                    Double resultado = 0.0;
                    Double cantidad = pnlCantidad.getCantidad();
                    System.out.println(cantidad);
                    if(pnlSelector.getCmbSelector() == 1 ){
                        
                        resultado = cantidad / DOLAR;
                        pnlCantidad.setText(resultado);
                        
                    }else if(pnlSelector.getCmbSelector() == 2){
                        resultado = cantidad * DOLAR;
                        pnlCantidad.setText(resultado);                 
                    }
                } catch (NumeroIncorrecto ex) {
                    Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        
        
        pnlSalir = new SalirPanel();
        pnlSalir.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnlSalir.setListener(new SalirPanelInterface(){
            @Override
            public void salirButtonClick() {
                System.exit(0);
            }         
        });
        
        
        super.add(pnlCantidad, BorderLayout.NORTH);
        super.add(pnlSalir, BorderLayout.SOUTH);
        super.add(pnlSelector);
        super.setVisible(true);
    }
    
    public static void main(String[] args) {
        new PrincipalFrame();
    }
    
}
