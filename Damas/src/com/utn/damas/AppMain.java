package com.utn.damas;

public class AppMain {
	
	public static void main(String[] args) {
		DamasModelo DM = new DamasModelo();
		DamasVista DV = new DamasVista(DM.getTablero());
		
		DamasControlador Dcontrol = new DamasControlador(DM,DV);

		Dcontrol.siguiente();
		
	}
	
	
	
}
