package com.utn.damas;

import javax.swing.JButton;

public class Casilla extends JButton{
private int Jugador=0;   //Jugadores
private int fila;
private int columna;
private Piesa piesa;

public Casilla(int estado, int fila, int columna) {
	super(String.valueOf(estado));
	this.Jugador = estado;
	this.fila = fila;
	this.columna = columna;
	this.piesa = null;
}

public Casilla(Piesa piesa, int estado, int fila, int columna) {
	super(String.valueOf(estado));
	this.Jugador = estado;
	this.fila = fila;
	this.columna = columna;
	this.piesa = piesa;
}

public void SetJugadorPiesa(int jugador, Piesa piesa)
{
	this.Jugador = jugador;
	this.piesa = piesa;
}


public void setPiesa(Piesa piesa) {
	this.piesa = piesa;
}

public Piesa getPiesa() {
	return piesa;
}

public int getFila() {
	return fila;
}

public int getColumna() {
	return columna;
}

public String GetNombre()
{
	if(piesa==null)
		return "";
	else
		return Jugador + "-" + piesa;
}

public int getJugador() {
	return Jugador; //Numero de jugador.
}

public int getSumaCasilla()
{
	return fila + columna;
}

}
