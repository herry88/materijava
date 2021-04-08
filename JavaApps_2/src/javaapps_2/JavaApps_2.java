/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps_2;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ubuntu
 */
public class JavaApps_2 extends JFrame{
    private Container panel = new Container();
    public JavaApps_2(String title){
//          super("Latihan");
          setSize(400, 350);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setTitle(title);
          
          panel = getContentPane();
          JButton tombol_1 = new JButton("Hello Java");
          panel.add(tombol_1, BorderLayout.SOUTH);
          
          //setMenampilan ui
          setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame.setDefaultLookAndFeelDecorated(true);
        new JavaApps_2("Coba Dulu");
//          new Test();
    }
    
}
