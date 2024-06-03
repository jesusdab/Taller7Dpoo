package uniandes.dpoo.taller7.interfaz2;

import javax.swing.*;
import java.awt.*;

public class PanelInferior extends JPanel {

    public PanelInferior() {
        
        setLayout(new FlowLayout());

       
        JLabel label = new JLabel("Jugadas:");
        JTextField textField = new JTextField(20);
        JLabel label2 = new JLabel("Jugador:");
        JTextField textField2 = new JTextField(20);
        
     
        label.setFont(new Font("Arial", Font.BOLD, 14));
        textField.setFont(new Font("Arial", Font.PLAIN, 14));

        
        add(label);
        add(textField);
        add(label2);
        add(textField2);
    }
}
