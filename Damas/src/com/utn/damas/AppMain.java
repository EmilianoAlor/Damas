package com.utn.damas;

public class AppMain {
	
	public static void main(String[] args) {
		
		// Inicia el Modelo.
		DamasModelo DM = new DamasModelo();
		
		// Inicia la vita y carga el tablero.
		DamasVista DV = new DamasVista(DM.getTablero());
		
		// Carga el Controlardor y carga el modelo y la vista
		DamasControlador Dcontrol = new DamasControlador(DM,DV);

		Dcontrol.siguiente();
		
	}
	
	
	
}
