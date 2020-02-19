package Ristorante;

public class Bebidas {
	private String tipo;
	private String sabores;
	private String tamaño;
	private double precio;
	
	public Bebidas (String tipo, String sabores, String tamaño, double precio) {
		this.tipo = tipo;
		this.sabores = sabores;
		this.tamaño = tamaño;
		this.precio = precio;
	}
	
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
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
