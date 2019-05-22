package com.utn.damas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DamasControlador implements ActionListener {
private DamasVista DV;
private DamasModelo DM;
private	Casilla[][] tablero;
private boolean Seleccion=false;
private Casilla Actual;
private Casilla Anterior;
private Casilla Selecionada;

	public DamasControlador(DamasModelo dM, DamasVista dV) {
		DV = dV;
		DM = dM;
		this.tablero = DM.getTablero();
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				
				//JButton b = new JButton(valor);
				tablero[i][j].addActionListener(this);
			}
		}
	}

	 public void actionPerformed(ActionEvent e) {
		 
//		  	Anterior = Actual;
		 	Actual = (Casilla) e.getSource();
		 	
		 	if(Actual.getEstado()!=0) 
		 	{
		 		
			 	if(Selecionada == Actual && Seleccion==true)
			 	{
			 		Seleccion=false;
			 		DV.DesSelecionarCasilla(Selecionada);
			 		Selecionada = null;
			 	}
			 	else
			 	{
				 	
				 		if(Seleccion==false)
				 		{
				 			Selecionada = Actual;
				 			DV.SelecionarCasilla(Selecionada);
				 			Seleccion=true;
				 		}
			 	}
		 	}
//		 	else
//		 		Actual=Anterior;
		 	
	        if (e.getSource()==tablero[0][0]) {
	        	System.out.println("boton 0-0 x");
	        }
	        if (e.getSource()==tablero[0][1]) {
	        	System.out.println("boton 0-1");
	        }
	        if (e.getSource()==tablero[0][2]) {
	        	System.out.println("boton 0-2");
	        }
	        if (e.getSource()==tablero[0][3]) {
	        	System.out.println("boton 0-3");
	        }
	        //**********************************************************
	        if (e.getSource()==tablero[1][0]) {
	        	System.out.println("boton 1-0");
	        }
	        if (e.getSource()==tablero[1][1]) {
	        	System.out.println("boton 1-1");
	        }
	        if (e.getSource()==tablero[1][2]) {
	        	System.out.println("boton 1-2");
	        }
	        if (e.getSource()==tablero[1][3]) {
	        	System.out.println("boton 1-3");
	        }
	      //**********************************************************
	        if (e.getSource()==tablero[2][0]) {
	        	System.out.println("boton 2-0");
	        }
	        if (e.getSource()==tablero[2][1]) {
	        	System.out.println("boton 2-1");
	        }
	        if (e.getSource()==tablero[2][2]) {
	        	System.out.println("boton 2-2");
	        }
	        if (e.getSource()==tablero[2][3]) {
	        	System.out.println("boton 2-3");
	        }
	        
	      //**********************************************************
	        if (e.getSource()==tablero[3][0]) {
	        	System.out.println("boton 3-0");
	        }
	        if (e.getSource()==tablero[3][1]) {
	        	System.out.println("boton 3-1");
	        }
	        if (e.getSource()==tablero[3][2]) {
	        	System.out.println("boton 3-2");
	        }
	        if (e.getSource()==tablero[3][3]) {
	        	System.out.println("boton 3-3");
	        }
	    }
	
	public boolean siguiente()
	{
		DV.DibujarPantalla();
		return true;
	}
}
