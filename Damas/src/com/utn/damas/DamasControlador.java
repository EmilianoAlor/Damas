package com.utn.damas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DamasControlador implements ActionListener {
private DamasVista DV;
private DamasModelo DM;
private	Casilla[][] tablero;
private boolean Seleccion=false;
private Casilla Actual;
private Casilla Seleccionada;
private int JugadorInicial=1;
private int Jugador_turno;
int direccion=0; //Direccion de las fichas 

	public DamasControlador(DamasModelo dM, DamasVista dV) {
		DV = dV;
		DM = dM;
		this.tablero = DM.getTablero();
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				tablero[i][j].addActionListener(this);
			}
		}
	}

	 public void actionPerformed(ActionEvent e) {
		 
		 	Actual = (Casilla) e.getSource();
		 	System.out.println("Boton " + Actual.getFila() + "-" + Actual.getColumna());
		 	
		 	int jugador_Actual;//Jugador_turno
		 	
		 	jugador_Actual = Actual.getJugador();
		 	if(jugador_Actual!=0 ) // la celda esta ocupada && jugador_Actual==Jugador_turno
		 	{
			 	if(Seleccionada == Actual && Seleccion==true)
			 	{
			 		Seleccion=false;
			 		DV.DesSelecionarCasilla(Seleccionada);
			 		Seleccionada = null;
			 	}
			 	else
			 	{
				 		if(Seleccion==false)
				 		{
				 			Seleccionada = Actual;
				 			DV.SelecionarCasilla(Seleccionada);
				 			Seleccion=true;
				 		}
			 	}
		 	}
		 	else //celda vacia para posible movimiento.
		 		ComportamientoPiesa();
	    }
	
	private void ComportamientoPiesa() {
		
		if(Seleccion == true && Seleccionada != Actual) //hya una pieza seleccionada y la siguiente es distinta.
		{
			switch (Seleccionada.getPiesa()) {
			case FICHA:
				if(Actual.getJugador()==0) //Movimiento a casilla vacia.
				{
					if(Seleccionada.getJugador() == 1)
						direccion = 1;
					
					if(Seleccionada.getJugador() == 2)
						direccion = -1;
					
					if(Actual.getFila()==Seleccionada.getFila()+1*direccion && (Actual.getColumna()==Seleccionada.getColumna()-1 || Actual.getColumna()==Seleccionada.getColumna()+1))
					{
						movimientoPiesa();
						
					}else if(Actual.getFila()==Seleccionada.getFila()+2*direccion && (Actual.getColumna()==Seleccionada.getColumna()-2 || Actual.getColumna()==Seleccionada.getColumna()+2))
					{
						if(ComerFicha(direccion))
						{
					 		movimientoPiesa();
						}
					}
				}
				break;
			case REINA:
				if(Actual.getJugador()==0) //Movimiento a casilla vacia.
				{
					if((Actual.getFila()==Seleccionada.getFila()+1 || Actual.getFila()==Seleccionada.getFila()-1) && (Actual.getColumna()==Seleccionada.getColumna()-1 || Actual.getColumna()==Seleccionada.getColumna()+1))
					{
				 		movimientoPiesa();
					}
					else if((Actual.getFila()==Seleccionada.getFila()+2 || Actual.getFila()==Seleccionada.getFila()-2) && (Actual.getColumna()==Seleccionada.getColumna()-2 || Actual.getColumna()==Seleccionada.getColumna()+2))
					{
						if(ComerFicha(direccion))
						{
					 		movimientoPiesa();
						}
					}
				}
				break;
			default:
				{
					System.out.println("La piesa no esta configurada.");
				break;
				}
			}
		}
	}

	private void movimientoPiesa()
	{
		Actual.SetJugadorPiesa(Seleccionada.getJugador(), Seleccionada.getPiesa());
		
		if(Seleccionada.getPiesa()==Piesa.FICHA) 
		{
			if(direccion == 1 && (Actual.getFila() == DM.getFilaMax()-1))
				Actual.setPiesa(Piesa.REINA);
			
			if(direccion == -1 && (Actual.getFila() == 0))
				Actual.setPiesa(Piesa.REINA);
		}
		
		Seleccionada.SetJugadorPiesa(0, null);
		Seleccion=false;
 		DV.DesSelecionarCasilla(Seleccionada);
 		Seleccionada = null;
 		DV.Redibujar();
	}
	
	public boolean ComerFicha(int direccion){
		int fila=0,columna=0;
		
		if(Seleccionada.getFila()<Actual.getFila() && Seleccionada.getColumna()<Actual.getColumna())
		{
			fila=Actual.getFila()-1;
			columna=Actual.getColumna()-1;	
		}
		
		if(Seleccionada.getFila()<Actual.getFila() && Seleccionada.getColumna()>Actual.getColumna())
		{
			fila=Actual.getFila()-1;
			columna=Actual.getColumna()+1;	
		}
		
		if(Seleccionada.getFila()>Actual.getFila() && Seleccionada.getColumna()<Actual.getColumna())
		{
			fila=Actual.getFila()+1;
			columna=Actual.getColumna()-1;	
		}
		
		if(Seleccionada.getFila()>Actual.getFila() && Seleccionada.getColumna()>Actual.getColumna())
		{
			fila=Actual.getFila()+1;
			columna=Actual.getColumna()+1;	
		}
		
		if(tablero[fila][columna].getJugador()!=Seleccionada.getJugador())
		{
			tablero[fila][columna].SetJugadorPiesa(0, null);
			return true;
		}
		else
			return false;
	}
	
	public boolean siguiente()
	{
		Jugador_turno = JugadorInicial;
		DV.DibujarPantalla();
		return true;
	}
}
