package Ristorante;

public class Pastas {
	private String sabores;
	private String tipo;
	private double precio;
	
	public Pastas (String sabores, String tipo, double precio) {
		this.sabores = sabores;
		this.tipo = tipo;
		this.precio = precio;
	}

	public String getSabores() {
		return sabores;
	}

	public void setSabores(String sabores) {
		this.sabores = sabores;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
