package com.utn.damas;

import javax.swing.JButton;

public class Casilla extends JButton{
private int estado=0;
private int fila;
private int columna;

public Casilla(int estado, int fila, int columna) {
	super(String.valueOf(estado));
	this.estado = estado;
	this.fila = fila;
	this.columna = columna;
}


}
