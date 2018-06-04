package capitulo9;

public class Ejercicio1_Exception extends Exception{
		
		/**
	 * 
	 */
	private static final long serialVersionUID = -297919864238235447L;
		String referencia;
		
		Ejercicio1_Exception  (String argumento){
			referencia = argumento; 
		}

		public void print_referencia() {
			System.out.println(referencia);
		}
		
		public static void main(String[] args) {
			
			try {
				throw new Ejercicio1_Exception("Excepción de prueba");				
			}
			catch (Ejercicio1_Exception e) {
				System.out.println("Se ha capturado la excepción: " + e.referencia);
			}
			
		}

	}
