package com.utn.damas;

public class DamasModelo {

	private Casilla [ ] [ ] numEnteros=new Casilla [4] [4];
	
	public DamasModelo()
	{
		numEnteros[0][0]=new Casilla(Piesa.FICHA,1, 0, 0);
		numEnteros[0][1]=new Casilla(0, 0, 1);
		numEnteros[0][2]=new Casilla(Piesa.FICHA,1, 0, 2);
		numEnteros[0][3]=new Casilla(0, 0, 3);
		
		numEnteros[1][0]=new Casilla(0, 1, 0);
		numEnteros[1][1]=new Casilla(0, 1, 1);
		numEnteros[1][2]=new Casilla(0, 1, 2);
		numEnteros[1][3]=new Casilla(0, 1, 3);
		
		numEnteros[2][0]=new Casilla(0, 2, 0);
		numEnteros[2][1]=new Casilla(0, 2, 1);
		numEnteros[2][2]=new Casilla(0, 2, 2);
		numEnteros[2][3]=new Casilla(0, 2, 3);
		
		numEnteros[3][0]=new Casilla(0, 3, 1);
		numEnteros[3][1]=new Casilla(Piesa.FICHA,2, 3, 1);
		numEnteros[3][2]=new Casilla(0, 3, 1);
		numEnteros[3][3]=new Casilla(Piesa.FICHA,2, 3, 3);
	}

	public Casilla[][] getTablero() {
		return numEnteros;
	}
	
}
