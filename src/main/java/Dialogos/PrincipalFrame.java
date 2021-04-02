/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Miky
 */
public class PrincipalFrame extends JFrame{
    
    private RadioBotonesPanel pnlRadio;
    private CapturarPanel pnlCapturar;
    private BotonPanel pnlGenerar;
    
    public PrincipalFrame(){
        super("Dialogos");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 230);
        super.setLayout(new GridLayout(2,1,0,40));
        super.setLocationRelativeTo(null);
        
        pnlRadio = new RadioBotonesPanel();
        pnlCapturar = new CapturarPanel();
        pnlGenerar = new BotonPanel();
        pnlGenerar.setListener(new BotonesInterface() {
            @Override
            public void generar() {
                if(pnlRadio.radioErrorSelected()){
                    JOptionPane.showMessageDialog(pnlGenerar, pnlCapturar.getMensaje(), pnlCapturar.getTitulo(), JOptionPane.ERROR_MESSAGE);
                }else if(pnlRadio.radioInformacionSelected()){
                    JOptionPane.showMessageDialog(pnlGenerar, pnlCapturar.getMensaje(), pnlCapturar.getTitulo(), JOptionPane.INFORMATION_MESSAGE);
                }else if(pnlRadio.radioPrecaucionSelected()){
                    JOptionPane.showMessageDialog(pnlGenerar, pnlCapturar.getMensaje(), pnlCapturar.getTitulo(), JOptionPane.WARNING_MESSAGE);
                }else if(pnlRadio.radioPreguntaSelected()){
                    JOptionPane.showMessageDialog(pnlGenerar, pnlCapturar.getMensaje(), pnlCapturar.getTitulo(), JOptionPane.QUESTION_MESSAGE);
                }
            }  
        });
        
       
        
        super.add(pnlRadio);
        super.add(pnlCapturar);
        super.add(pnlGenerar);
        super.setVisible(true);
    }   
    
    public static void main(String[] args) {
        new PrincipalFrame();
    }
    
}
