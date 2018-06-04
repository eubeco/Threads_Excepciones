package capitulo9_ejercicios_resueltos;

import java.io.*;
/*
 * Definiremos un objeto Agenda que guarde los nombres y apellidos
 * de cada entrada de la agenda
 */
class Agenda implements Serializable{
	private String nombre;
	private String p_Apellido;
	private String s_Apellido;
	
	public Agenda(String nombre, String p_Apellido, String s_Apellido){
		super();
		this.nombre = nombre;
		this.p_Apellido = p_Apellido; 
		this.s_Apellido = s_Apellido;
	}
	
	public String toString(){
		return( this.nombre + " " + this.p_Apellido + " " + this.s_Apellido);
	}
}
