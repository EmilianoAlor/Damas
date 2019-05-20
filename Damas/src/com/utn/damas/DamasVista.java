package com.utn.damas;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DamasVista extends JFrame{

	public DamasVista() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
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
	
    public void DibujarPantalla(int[][] js)
    {
    	Container cp = getContentPane();
    	 GridLayout gl = new GridLayout(4,4);
    	 gl.setHgap(5); gl.setVgap(5);
    	 cp.setLayout(gl);
    	 
    	 String valor;
    	 
    	 for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				
				if(js[i][j]!=0)
					valor =String.valueOf(js[i][j]);
				else
					valor = "";
				
				cp.add(new JButton(valor));
			}
		}
    	 
    }
    
}
