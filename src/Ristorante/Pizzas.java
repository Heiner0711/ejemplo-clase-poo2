package Ristorante;

public class Pizzas {
	private String sabores;
	private Integer porciones;
	private double precio;
	
	public Pizzas (String sabores, Integer porciones, double precio) {
		this.sabores = sabores;
		this.porciones = porciones;
		this.precio = precio;
	}

	public String getSabores() {
		return sabores;
	}

	public void setSabores(String sabores) {
		this.sabores = sabores;
	}

	public Integer getPorciones() {
		return porciones;
	}

	public void setPorciones(Integer porciones) {
		this.porciones = porciones;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
