package Ristorante;

public class Combos {
	private Pizzas pizzas;
	private Bebidas bebidas;
	private Pastas pastas;
	private Lasagnas lasagnas;
	private double puno;
	private double pdos;
	private double ptres;
	
	public Combos() {
		
	}
	public Combos (Pizzas pizzas, Bebidas bebidas, Pastas pastas, Lasagnas lasagnas) {
		this.pizzas = pizzas;
		this.bebidas = bebidas;
		this.pastas = pastas;
		this.lasagnas = lasagnas;
		
	}

	public Pizzas getPizzas() {
		return pizzas;
	}

	public void setPizzas(Pizzas pizzas) {
		this.pizzas = pizzas;
	}

	public Bebidas getBebidas() {
		return bebidas;
	}

	public void setBebidas(Bebidas bebidas) {
		this.bebidas = bebidas;
	}

	public Pastas getPastas() {
		return pastas;
	}

	public void setPastas(Pastas pastas) {
		this.pastas = pastas;
	}

	public Lasagnas getLasagnas() {
		return lasagnas;
	}

	public void setLasagnas(Lasagnas lasagnas) {
		this.lasagnas = lasagnas;
	}

	public double getPuno() {
		return this.pizzas.getPrecio()+this.bebidas.getPrecio() * 0.15;
	}

	public void setPuno(double puno) {
		this.puno = puno;
	}

	public double getPdos() {
		return this.lasagnas.getPrecio()+this.bebidas.getPrecio() * 0.15;
	}

	public void setPdos(double pdos) {
		this.pdos = pdos;
	}

	public double getPtres() {
		return this.pastas.getPrecio()+this.bebidas.getPrecio() * 0.15;
	}

	public void setPtres(double ptres) {
		this.ptres = ptres;
	}
	
	
	
}
