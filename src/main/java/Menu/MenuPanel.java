/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 *
 * @author Miky
 */
public class MenuPanel extends JPanel{
    
    private  JMenuBar mbBar;
    
    private JMenu mnArchivo;
    private JMenu mnAyuda;
    
    private JMenuItem itNuevo;
    private JMenuItem itAbrir;
    private JMenuItem itSalir;
    private JMenuItem itAcerca;
    
    private MenuInterface listener;

    

    public MenuPanel() {
        
        mbBar = new JMenuBar();
        
        mnArchivo = new JMenu("Archivo");
        mnAyuda = new JMenu("Ayuda");
        
        itNuevo = new JMenuItem("Nuevo");
        itAbrir = new JMenuItem("Abrir");
        itSalir = new JMenuItem("Salir");
        itAcerca = new JMenuItem("Acerca de...");
        
        mnArchivo.add(itNuevo);
        mnArchivo.add(itAbrir);
        mnArchivo.add(itSalir);
        mnAyuda.add(itAcerca);
        
        itNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.nuevo();
            } 
        });
        
        itAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.abrir();
            } 
        });
        
        itSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.salir();
            } 
        });
        
        itAcerca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.about();
            } 
        });
        
        itNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Event.CTRL_MASK));
        itAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK));
        itSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK));
                
        mbBar.add(mnArchivo);
        mbBar.add(mnAyuda);
        
        //super.add(mnArchivo);
        //super.add(mnAyuda);
        super.add(mbBar);        
    }
    
    public JMenuBar getMbBar() {
        return mbBar;
    }
    
    public void setListener(MenuInterface listener) {
        this.listener = listener;
    }
}
