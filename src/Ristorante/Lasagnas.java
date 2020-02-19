package Ristorante;

public class Lasagnas {
	private String sabores;
	private String tamaño;
	private double precio;
	
	public Lasagnas (String sabores, String tamaño, double precio) {
		this.sabores = sabores;
		this.tamaño = tamaño;
		this.precio = precio;
	}

	public String getSabores() {
		return sabores;
	}

	public void setSabores(String sabores) {
		this.sabores = sabores;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
