package capitulo9;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio2_Reanudacion {

	public static void main(String[] args){		
		
		boolean bcontinuar = true;
		String strOpcion = null;
		int num;

		InputStreamReader isrOpcion = new InputStreamReader(System.in);
		BufferedReader bfOpcion = new BufferedReader(isrOpcion);
		
		while (bcontinuar){

			try {
				System.out.println("Introduzca un número entero para salir del BUCLE:" );
				strOpcion = bfOpcion.readLine();
				num = Integer.parseInt(strOpcion);
				bcontinuar = false;
				
			}
			catch (IOException e) {
				System.out.println("¡IOException! Ha introducido: " + strOpcion);				
			}
			catch (NumberFormatException ex) {
				System.out.println("¡NumberFormatExcepción! Ha introducido: " + strOpcion);
			}
		}		 
		 
	}

}
