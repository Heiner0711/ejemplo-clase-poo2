package Ristorante;

public class Lasagnas {
	private String sabores;
	private String tama�o;
	private double precio;
	
	public Lasagnas (String sabores, String tama�o, double precio) {
		this.sabores = sabores;
		this.tama�o = tama�o;
		this.precio = precio;
	}

	public String getSabores() {
		return sabores;
	}

	public void setSabores(String sabores) {
		this.sabores = sabores;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
