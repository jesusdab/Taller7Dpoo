package uniandes.dpoo.taller7.interfaz1;

import javax.swing.*;

import uniandes.dpoo.taller7.interfaz2.PanelDerecha;
import uniandes.dpoo.taller7.interfaz2.PanelInferior;
import uniandes.dpoo.taller7.interfaz2.PanelSuperior;
import uniandes.dpoo.taller7.interfaz3.PanelTablero;

import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private PanelTablero panelTablero;

    public VentanaPrincipal() {
        setTitle("Ventana Principal Personalizada");

        setSize(800, 600);

        setLayout(new BorderLayout());

        PanelSuperior panelSuperior = new PanelSuperior(this);
        PanelDerecha panelDerecha = new PanelDerecha(this);
        PanelInferior panelInferior = new PanelInferior();
        panelTablero = new PanelTablero(5, this); 

        add(panelSuperior, BorderLayout.NORTH);
        add(panelDerecha, BorderLayout.EAST);
        add(panelInferior, BorderLayout.SOUTH);
        add(panelTablero, BorderLayout.CENTER);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public void crearNuevoTablero() {
        System.out.println("Creando un nuevo tablero");
    }

    public void reiniciarTablero() {
        System.out.println("Reiniciando el tablero");
    }

    public void mostrarTop10() {
        System.out.println("Mostrando el Top - 10");
    }

    public void cambiarJugador() {
        System.out.println("Cambiando el jugador");
    }

   
    public void cambiarCasilla1(int row, int col) {
        System.out.println("Cambiando la casilla en la fila " + row + " y la columna " + col);
    }

    public static void main(String[] args) {

        new VentanaPrincipal();
    }

	public void cambiarCasilla(int row, int col) {
		// TODO Auto-generated method stub
		
	}
    public void actualizarTablero(int nuevoTamano) {
        panelTablero.setSize(nuevoTamano);
    }
}
