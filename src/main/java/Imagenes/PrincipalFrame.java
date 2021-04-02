/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Miky
 */
public class PrincipalFrame extends JFrame{
    
    private CheckBoxPanel pnlCheck;
    private JLabel lbImg;

    public PrincipalFrame(){
        super("Geek");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 200);
        super.setLayout(new GridLayout(1,2,10,0));
        super.setLocationRelativeTo(null);
        
        pnlCheck = new CheckBoxPanel();
        lbImg = new JLabel();
        lbImg.setIcon(new ImageIcon("img/geek-----.gif"));
        
        pnlCheck.setListener(new CheckBoxListener() {
            @Override
            public void checkBarbilla() {
                System.out.println(calcularNombre());  
                ruta(calcularNombre());
            }

            @Override
            public void checkLentes() {
                System.out.println(calcularNombre()); 
                ruta(calcularNombre());
            }

            @Override
            public void checkCabello() {
                System.out.println(calcularNombre());  
                ruta(calcularNombre());
            }

            @Override
            public void checkDientes() {
                System.out.println(calcularNombre());   
                ruta(calcularNombre());
            }
            
            public String calcularNombre(){
                String resultado = "geek-";
                
                resultado = resultado + (pnlCheck.isSelectBarbilla() ? "c" : "-");
                resultado = resultado + (pnlCheck.isSelectLentes()? "g" : "-");
                resultado = resultado + (pnlCheck.isSelectCabello()? "h" : "-");               
                resultado = resultado + (pnlCheck.isSelectDientes()? "t" : "-");
                
                return resultado + ".gif";
            }
            
            public void ruta(String a){
                lbImg.setIcon(new ImageIcon(String.format("img/%s", a)));
            }
            
        });
        
        
        super.add(pnlCheck);
        super.add(lbImg);
        super.setVisible(true);
    }
    
    public static void main(String[] args) {
        new PrincipalFrame();
    }
}
