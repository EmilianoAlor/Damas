package com.utn.damas;

public class AppMain {
	
	public static void main(String[] args) {
		DamasModelo DM = new DamasModelo();
		DamasVista DV = new DamasVista();
		
		DamasControlador Dcontrol = new DamasControlador(DM,DV);

		boolean valorboo;

		valorboo = Dcontrol.siguiente();
		
//		while(valorboo== true)
//		{
//			//valorboo = Dcontrol.siguiente();
//		}
	}
	
	
	
}
