package capitulo9;

public class CajeraThreads extends Thread{ 

	private String nombre;
	private Cliente cliente;
	private long timeStamp;

		CajeraThreads(String nombreCajera, Cliente cli, long time){
		this.nombre = nombreCajera; 
		this.cliente = cli;
		this.timeStamp = time;
	}	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void run()  {
		
		System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 +"seg");
		
		for (int i = 0; i < cliente.getCarroCompra().length; i++) {			
			this.esperarXsegundos(cliente.getCarroCompra()[i]);			
			System.out.println("Procesado el producto " + (i + 1) + " ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");			
		}	
		
		System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg"); 
	}

	private void esperarXsegundos(int segundos) { 
		try { 
			Thread.sleep(segundos * 1000);
			
		} 
		catch (InterruptedException ex) { 
			Thread.currentThread().interrupt(); 
		}
		
	} 
}
