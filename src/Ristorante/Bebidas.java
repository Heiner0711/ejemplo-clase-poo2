package Ristorante;

public class Bebidas {
	private String tipo;
	private String sabores;
	private String tama�o;
	private double precio;
	
	public Bebidas (String tipo, String sabores, String tama�o, double precio) {
		this.tipo = tipo;
		this.sabores = sabores;
		this.tama�o = tama�o;
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
