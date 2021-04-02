/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Miky
 */
public class EntrarPanel extends JPanel{
    
    private JButton btEntrar;
    private EntrarInterface listener;

    public void setListener(EntrarInterface listener) {
        this.listener = listener;
    }

    public EntrarPanel() {
        super.setLayout(new FlowLayout());
        
        btEntrar = new JButton("ENTRAR");
        btEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.entrar();
            }
            
        });
        
        super.add(btEntrar);
    }
    
    
    
}
