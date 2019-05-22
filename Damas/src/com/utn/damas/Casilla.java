package com.utn.damas;

import javax.swing.JButton;

public class Casilla extends JButton{
private int estado=0;   //Jugadores
private int fila;
private int columna;
private Piesa piesa;

public Casilla(int estado, int fila, int columna) {
	super(String.valueOf(estado));
	this.estado = estado;
	this.fila = fila;
	this.columna = columna;
	this.piesa = null;
}

public Casilla(Piesa piesa, int estado, int fila, int columna) {
	super(String.valueOf(estado));
	this.estado = estado;
	this.fila = fila;
	this.columna = columna;
	this.piesa = piesa;
}

public String GetNombre()
{
	if(piesa==null)
		return "";
	else
		return estado + "-" + piesa;
}

public int getEstado() {
	return estado;
}

public int getSumaCasilla()
{
	return fila + columna;
}

}
