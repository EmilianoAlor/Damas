package com.utn.damas;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DamasVista extends JFrame{
private	Casilla[][] tablero;

	public DamasVista(Casilla[][] tablero) {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        this.tablero = tablero;
    }

    private void configurarVentana() {
        this.setTitle("Damas");                   // colocamos titulo a la ventana
        this.setSize(1000, 1000);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
        this.setVisible(true);
    }
	
    public void DibujarPantalla()
    {
    	Container cp = getContentPane();
    	 GridLayout gl = new GridLayout(4,4);
    	 gl.setHgap(5); gl.setVgap(5);
    	 cp.setLayout(gl);
    	 
    	 for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				
				//JButton b = new JButton(valor);
				//tablero[i][j].addActionListener(this);
				cp.add(tablero[i][j]);
			}
		}
    	 
    }
    
   
    
}
