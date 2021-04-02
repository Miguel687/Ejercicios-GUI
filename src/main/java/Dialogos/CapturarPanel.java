/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Miky
 */
public class CapturarPanel extends JPanel{
    
    private JLabel titulo;
    private JLabel mensaje;
    
    private JTextField textTitulo;
    private JTextField textMensaje;
    
    private JPanel pnlTitulo;
    private JPanel pnlMensaje;
    
    public CapturarPanel(){
        super.setLayout(new GridLayout(2,1));
        
        titulo = new JLabel("Título");
        mensaje = new JLabel("Mensaje");
        
        textTitulo = new JTextField(); 
        textMensaje = new JTextField();
        
        pnlTitulo = new JPanel();
        pnlTitulo.setLayout(new GridLayout(2,1));
        
        pnlMensaje = new JPanel();
        pnlMensaje.setLayout(new GridLayout(2,1));
        
        super.add(titulo);
        super.add(mensaje);
        
        super.add(textTitulo);
        super.add(textMensaje);
        
        super.add(pnlTitulo);
        super.add(pnlMensaje);
        
        pnlTitulo.add(titulo);
        pnlTitulo.add(textTitulo);
        
        pnlMensaje.add(mensaje);
        pnlMensaje.add(textMensaje);   
    }
    
    public String getTitulo(){
        return textTitulo.getText();
    }
    
    public String getMensaje(){
        return textMensaje.getText();
    }
    
}
