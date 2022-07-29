package com.utn.damas;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class DamasVista extends JFrame{
private	Casilla[][] tablero;
private Color gris = new Color(238,238,238);



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
    	 GridLayout gl = new GridLayout(10,10);
    	 gl.setHgap(5); gl.setVgap(5);
    	 cp.setLayout(gl);
    	 
    	 for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				tablero[i][j].setText(null);//tablero[i][j].GetNombre());
				
				if((i+j)%2 ==0)
					tablero[i][j].setBackground(Color.WHITE);
				else
					tablero[i][j].setBackground(gris);

//			 Border line = new LineBorder(Color.BLACK);
//			 Border margin = new EmptyBorder(5, 15, 5, 15);
//			 Border compound = new CompoundBorder(line, margin);
//			 tablero[i][j].setBorder(compound);
			
				
				cp.add(tablero[i][j]);
			}
		}
    	 Redibujar();
    }
    
    public void SelecionarCasilla(Casilla Actual)
	 {
    	Actual.setForeground(Color.BLACK);
    	Actual.setBackground(Color.RED);
	 }
   
    public void DesSelecionarCasilla(Casilla Actual)
	 {
	   	Actual.setForeground(Color.BLACK);
	   	
	   	if((Actual.getSumaCasilla())%2 ==0)
	   		Actual.setBackground(Color.WHITE);
	   	else
	   		Actual.setBackground(gris);
	 }
    
    public void Redibujar()
    {
    	for (int i = 0; i < 10; i++) 
			for (int j = 0; j < 10; j++) 
				{
				
				if(tablero[i][j].getPiesa()==null)
					tablero[i][j].setIcon(null);
				else
				{
					
					if(tablero[i][j].getPiesa()== Piesa.FICHA)
					{
						if(tablero[i][j].getJugador()==1)
							tablero[i][j].setIcon(new ImageIcon("F:\\JAVA WEB\\Damas\\Damas\\Imagenes\\FichaBlanca.jpg"));
						if(tablero[i][j].getJugador()==2)
							tablero[i][j].setIcon(new ImageIcon("F:\\JAVA WEB\\Damas\\Damas\\Imagenes\\FichaNegra.jpg"));
					}
					else if(tablero[i][j].getPiesa()== Piesa.REINA)
					{
						if(tablero[i][j].getJugador()==1)
							tablero[i][j].setIcon(new ImageIcon("F:\\JAVA WEB\\Damas\\Damas\\Imagenes\\ReinaBlanca.jpg"));
						if(tablero[i][j].getJugador()==2)
							tablero[i][j].setIcon(new ImageIcon("F:\\JAVA WEB\\Damas\\Damas\\Imagenes\\ReinaNegra.jpg"));
					}
					else
						tablero[i][j].setIcon(null);
				}
			}
    }
    
}
