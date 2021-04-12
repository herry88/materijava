/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps_2;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.ImageIcon;
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
          JButton tombol_0  = new JButton("Isi Nama Kamu");
          JButton tombol_1 = new JButton("Hello Java");
//          JButton tombol_00 = new JButton("Hello Java ya");
          JButton tombolC = new JButton(new ImageIcon("/home/ubuntu/NetBeansProjects/MateriJavaFundamental/JavaApps_2/src/images/tablet.jpg"));
          JButton tombol_2 = new JButton("Arah Kiri");
          JButton tombol_3 = new JButton("Arah Kanan");
          
          //arah tombol
          panel.add(tombol_0, BorderLayout.NORTH);
          panel.add(tombol_1, BorderLayout.SOUTH);
          panel.add(tombolC, BorderLayout.CENTER);
          panel.add(tombol_3, BorderLayout.EAST);
          panel.add(tombol_2, BorderLayout.WEST);
          
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
