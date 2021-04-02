/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author Miky
 */
public class PrincipalFrame extends JFrame{
    
    private CapturarPanel pnlCapturar;
    private JLabel lbPassword;
    private TogglePanel pnlToggle;
    private EntrarPanel pnlEntrar;
    
    
    

    public PrincipalFrame() throws IOException{
        super("LOGIN");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(330, 390);
        super.setLayout(new GridLayout(4,1,20,0));
        super.setLocationRelativeTo(null);
        
        pnlCapturar = new CapturarPanel();
        lbPassword = new JLabel("Contraseña");
        pnlToggle = new TogglePanel();
        pnlEntrar = new EntrarPanel();
        
        lbPassword.setVisible(false);
        
        pnlToggle.setListener(new ToggelInterface() { 
            @Override
            public void mostrarPassword() {
                if(!pnlToggle.selectToggle()){
                    lbPassword.setVisible(false);
                }else{
                   lbPassword.setVisible(true); 
                }
            } 
        });
        
        pnlCapturar.setListener(new PasswordInterface() {
            @Override
            public void escribio() {
                char[] valor = pnlCapturar.getText();
                System.out.println(valor);
                lbPassword.setText(String.valueOf(valor));
            }
            
        });
        
        pnlEntrar.setListener(new EntrarInterface() {
            @Override
            public void entrar() {
                JOptionPane.showMessageDialog(pnlEntrar, String.format("Bienvenido %s !", pnlCapturar.getUser()), "Acceso permitido", JOptionPane.INFORMATION_MESSAGE);
            } 
        });
                
        super.add(pnlCapturar, FlowLayout.LEFT);
        super.add(lbPassword);
        super.add(pnlToggle);
        super.add(pnlEntrar);
        super.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        new PrincipalFrame();
    }
    
}
