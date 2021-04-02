/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;


/**
 *
 * @author Miky
 */
public class PrincipalFrame extends JFrame{
    
    
    private MenuPanel pnlMenu;  
    private JFileChooser selectorArchivos;

    public PrincipalFrame(){
        super("Menú");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 400);
        super.setLayout(null);
        super.setLocationRelativeTo(null);
        
        selectorArchivos = new JFileChooser();
        
        pnlMenu = new MenuPanel();
        pnlMenu.setListener(new MenuInterface(){
            @Override
            public void abrir() {
                selectorArchivos.showSaveDialog(pnlMenu);     
            }

            @Override
            public void salir() {
                System.exit(0);
            }

            @Override
            public void nuevo() {
                JOptionPane.showMessageDialog(pnlMenu, "Vas a abrir un nuevo documento" , "Nuevo", JOptionPane.QUESTION_MESSAGE);
            }

            @Override
            public void about() {
                JOptionPane.showMessageDialog(pnlMenu, "Versión 0.1", "About", JOptionPane.INFORMATION_MESSAGE);            
            }   
        });
        
        //super.add(mnArchivo);
        //super.add(mnAyuda);
        super.add(pnlMenu);   
        super.setJMenuBar(pnlMenu.getMbBar());
        super.setVisible(true);
    }

    public static void main(String[] args) {
        new PrincipalFrame();
    }
    
}
