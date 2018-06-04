package capitulo9_ejercicios_resueltos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExcepcionConReanudacion {
	public static void main(String[] args) {
		boolean continuar = true; 
		while(continuar) {        
			try {                
				System.out.print("Introduce un número entero: ");
				InputStreamReader datosInsertados = new InputStreamReader(System.in);
				BufferedReader datos = new BufferedReader(datosInsertados);
				String cadenaDatos = datos.readLine();
				int numero = Integer.parseInt(cadenaDatos);
				int cuadrado = numero * numero;
				System.out.println("El cuadrado de " + numero + " = " + cuadrado);
				continuar = false;
			} catch(Exception e) {
				System.out.println(e.getMessage());             
			}
		}
	}
}