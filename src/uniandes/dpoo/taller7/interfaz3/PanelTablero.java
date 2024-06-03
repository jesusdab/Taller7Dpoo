package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;

import uniandes.dpoo.taller7.interfaz1.VentanaPrincipal;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelTablero extends JPanel {
    private int size; 
    private VentanaPrincipal ventanaPrincipal;

    public PanelTablero(final int size, final VentanaPrincipal ventanaPrincipal) {
        this.size = size;
        this.ventanaPrincipal = ventanaPrincipal;
        setBackground(Color.WHITE);

     
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
         
                int cellSize = Math.min(getWidth(), getHeight()) / size;
                int col = e.getX() / cellSize;
                int row = e.getY() / cellSize;
                
                ventanaPrincipal.cambiarCasilla(row, col);
            }
        });
    }

    public void setSize(int size) {
        this.size = size;
        repaint(); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int cellSize = Math.min(getWidth(), getHeight()) / size;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                int x = col * cellSize;
                int y = row * cellSize;
                g2d.setColor(Color.BLACK);
                g2d.drawRect(x, y, cellSize, cellSize);

                if ((row + col) % 2 == 0) {
                    g2d.setColor(Color.WHITE);
                } else {
                    g2d.setColor(Color.WHITE);
                }
                g2d.fillRect(x, y, cellSize, cellSize);
            }
        }
    }
}
