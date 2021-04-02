/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author Miky
 */
public class TogglePanel extends JPanel{
    
    private JToggleButton tgPassword;
    private ImageIcon img;
    private ToggelInterface listener;

    public TogglePanel() throws IOException {
        super.setLayout(new FlowLayout());
        
        img = new ImageIcon("img/view.png");
        tgPassword = new JToggleButton();
        tgPassword.setIcon(new ImageIcon(img.getImage()));
        tgPassword.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.mostrarPassword();
            }
        });
        
        super.add(tgPassword);
    }

    public void setListener(ToggelInterface listener) {
        this.listener = listener;
    }
    
    public boolean selectToggle(){
        return tgPassword.isSelected();
    }
}
