package uniandes.dpoo.taller7.interfaz2;

import javax.swing.*;

import uniandes.dpoo.taller7.interfaz1.VentanaPrincipal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSuperior extends JPanel {

    public PanelSuperior(final VentanaPrincipal ventanaPrincipal) {
        
        setLayout(new FlowLayout());
        setBackground(Color.LIGHT_GRAY);

        
        JLabel label = new JLabel("Tamaño del tablero:");
        final JComboBox<String> comboBox = new JComboBox<>(new String[]{"5", "6", "7", "8", "9", "10"});
        JRadioButton radioButton1 = new JRadioButton("Fácil");
        JRadioButton radioButton2 = new JRadioButton("Medio");
        JRadioButton radioButton3 = new JRadioButton("Difícil");

        
        label.setFont(new Font("Arial", Font.BOLD, 14));
        comboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        radioButton1.setFont(new Font("Arial", Font.PLAIN, 14));
        radioButton2.setFont(new Font("Arial", Font.PLAIN, 14));
        radioButton3.setFont(new Font("Arial", Font.PLAIN, 14));

        
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nuevoTamano = Integer.parseInt((String) comboBox.getSelectedItem());
                ventanaPrincipal.actualizarTablero(nuevoTamano);
            }
        });

        
        add(label);
        add(comboBox);
        add(radioButton1);
        add(radioButton2);
        add(radioButton3);
    }
}
