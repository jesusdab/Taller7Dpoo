package uniandes.dpoo.taller7.interfaz2;

import javax.swing.*;

import uniandes.dpoo.taller7.interfaz1.VentanaPrincipal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDerecha extends JPanel {

    public PanelDerecha(VentanaPrincipal ventanaPrincipal) {

        setLayout(new GridLayout(0, 1)); 
        setBackground(Color.LIGHT_GRAY);

        JButton button1 = new JButton("Nuevo");
        JButton button2 = new JButton("Reiniciar");
        JButton button3 = new JButton("Top - 10");
        JButton button4 = new JButton("Cambiar Jugador");


        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button4.setFont(new Font("Arial", Font.BOLD, 14));


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Nuevo juego iniciado");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Juego reiniciado");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Mostrar Top - 10");
               
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Cambiar jugador");
                
            }
        });

        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }

}