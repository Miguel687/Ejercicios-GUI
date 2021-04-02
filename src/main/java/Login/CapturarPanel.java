/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Miky
 */
public class CapturarPanel extends JPanel{
    
    private JLabel lbUser;
    private JLabel lbPassword;
    
    private JTextField txUser;
    private JPasswordField txPassword;
    
    private JPanel pnlUser;
    private JPanel pnlPassword;
    
    private PasswordInterface listener;
    
    public CapturarPanel() {
        super.setLayout(new GridLayout(2,2,0,0));
        
        lbUser = new JLabel("Usuario:");
        lbPassword = new JLabel("Contraseña:");
        
        txUser = new JTextField();
        txPassword = new JPasswordField();
        pnlUser = new JPanel();
        pnlUser.setLayout(new GridLayout(2,3));
        pnlPassword = new JPanel();
        pnlPassword.setLayout(new GridLayout(2,3));
        
        txPassword.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                listener.escribio();
            }

            @Override
            public void keyPressed(KeyEvent e) {
                listener.escribio();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                listener.escribio();
            }


            
        });
        super.add(lbUser);
        super.add(txUser);
        super.add(lbPassword);
        super.add(txPassword);
        super.add(pnlUser);
        super.add(pnlPassword);
        pnlUser.add(lbUser);
        pnlUser.add(txUser);
        pnlPassword.add(lbPassword);
        pnlPassword.add(txPassword);
    }

    public void setListener(PasswordInterface listener) {
        this.listener = listener;
    }
    
    public char[] getText(){
        return txPassword.getPassword();
    }
    
    public String getUser(){
        return txUser.getText();
    }
    
}
