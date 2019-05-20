package com.utn.damas;

public class DamasControlador {
private DamasVista DV;
private DamasModelo DM;

	public DamasControlador(DamasModelo dM, DamasVista dV) {
		// TODO Auto-generated constructor stub
		DV = dV;
		DM = dM;
	}

	public boolean siguiente()
	{
		DV.DibujarPantalla(DM.getTablero());
		return true;
	}
}
