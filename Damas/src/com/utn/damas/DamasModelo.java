package com.utn.damas;

public class DamasModelo {
private int FilaMax;
private int ColumnaMax;

	private Casilla [ ] [ ] numEnteros=new Casilla [10] [10];
	
	public DamasModelo()
	{
		FilaMax = numEnteros.length;
		ColumnaMax = numEnteros[FilaMax-1].length;
		
		for (int i = 0; i < numEnteros.length; i++) {
			for (int j = 0; j < numEnteros[i].length; j++) {
				
				if((i+j)%2 ==1 && i<=2)
					numEnteros[i][j]=new Casilla(Piesa.FICHA,1, i, j);
				else if((i+j)%2 ==1 && i>=7)
					numEnteros[i][j]=new Casilla(Piesa.FICHA,2, i, j);
				else
					numEnteros[i][j]=new Casilla(0, i, j);
			}
		}
	}

	public Casilla[][] getTablero() {
		return numEnteros;
	}

	public int getFilaMax() {
		return FilaMax;
	}

	public int getColumnaMax() {
		return ColumnaMax;
	}
	
}
