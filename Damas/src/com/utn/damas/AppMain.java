package com.utn.damas;

public class AppMain {
	DamasModelo DM = new DamasModelo();
	DamasVista DV = new DamasVista();
	
	DamasControlador control = new DamasControlador(DM,DV);
}
