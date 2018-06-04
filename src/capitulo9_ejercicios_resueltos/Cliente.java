package capitulo9_ejercicios_resueltos;

public class Cliente { 
	private String nombre; 
	private int[] carroCompra;
	
	// 	Constructor, getter y setter	
	public String getNombre() {
		return nombre;
	}
	public Cliente(String nombre, int[] carroCompra) {
		super();
		this.nombre = nombre;
		this.carroCompra = carroCompra;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int[] getCarroCompra() {
		return carroCompra;
	}
	public void setCarroCompra(int[] carroCompra) {
		this.carroCompra = carroCompra;
	}
}
