package com.utn.damas;

public class DamasModelo {

	private int [ ] [ ] numEnteros=new int [4] [4];
	
	public DamasModelo()
	{
		numEnteros[0][0]=1;
		numEnteros[0][2]=1;
		numEnteros[3][1]=2;
		numEnteros[3][3]=2;
	}

	public int[][] getTablero() {
		return numEnteros;
	}
	
}
