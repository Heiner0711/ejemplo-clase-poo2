package Main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Ristorante.*;


	public class Main {

		public static void main (String[] args) {
			
			Pizzas p1 = new Pizzas("Pepperoni", 4, 8000.0f );
			Pizzas p2 = new Pizzas("Salchicha Italiana", 8, 16000.0f);
			Pizzas p3 = new Pizzas("Carbonara", 10, 18000.0f);
			
			Lasagnas l1 = new Lasagnas("Verduras y atún", "Pequeña", 6000.0f );
			Lasagnas l2 = new Lasagnas("Pollo y espinacas", "Mediana", 8000.0f);
			Lasagnas l3 = new Lasagnas("Merluza y vieras", "Grande", 10000.0f);
			
			Pastas v1 = new Pastas("Vermicelli con le Vongole", "spaghetti", 8000.0f);
			Pastas v2 = new Pastas("Trenette al Pesto", "Tornillo", 9000.0f);
			Pastas v3 = new Pastas("Ravioli con Salmón", "Penne", 10000.0f);
			
			Bebidas b1 = new Bebidas("Jugo", "Mango", "Grande", 2500.0f);
			Bebidas b2 = new Bebidas("Gaseosa", "Uva", "Personal", 2000.0f);
			Bebidas b3 = new Bebidas("Soda", "Limon", "Pequeña", 3000.0f);
			
			
			List<Pizzas> pizzas = new ArrayList<>();
			pizzas.add(p1);
			pizzas.add(p2);
			pizzas.add(p3);
			
			List<Lasagnas> lasagnas = new ArrayList<>();
			lasagnas.add(l1);
			lasagnas.add(l2);
			lasagnas.add(l3);
			
			List<Pastas> pastas = new ArrayList<>();
			pastas.add(v1);
			pastas.add(v2);
			pastas.add(v3);
			
			List<Bebidas> bebidas = new ArrayList<>();
			bebidas.add(b1);
			bebidas.add(b2);
			bebidas.add(b3);
			
			List<Combos> combouno = new ArrayList<>();
			for (Pizzas piz : pizzas) {
				Combos combos = new Combos();
				combos.setPizzas(piz);
				combouno.add(combos);}
			
			for(int i = 0; i < bebidas.size(); i++){
		         combouno.get(i).setBebidas(bebidas.get(i));}
				
			List<Combos> combodos = new ArrayList<>();
			for (Lasagnas lasag : lasagnas) {
				Combos comb = new Combos();
				comb.setLasagnas(lasag);
				combodos.add(comb);}
			for(int j = 0; j < bebidas.size(); j++){
			     combodos.get(j).setBebidas(bebidas.get(j));}
			
			Map<Integer, Combos> pedidos =new HashMap<>();
	        	pedidos.put(1, combouno.get(0));
	        	pedidos.put(2, combouno.get(1));
	        	pedidos.put(3, combouno.get(2));
	        	        
	        Map<Integer, Combos> pedido =new HashMap<>();
	        pedido.put(1, combodos.get(0));
	        pedido.put(2, combodos.get(1));
	        
	        	System.out.println("Pedido1: Pizzas " + pedidos.get(2).getPizzas().getSabores() + " " + pedidos.get(2).getPizzas().getPorciones() 
	        			+" "+ "porciones" + " "+"Bebida " + pedidos.get(2).getBebidas().getTipo() +" "+ pedidos.get(2).getBebidas().getSabores() + 
	        			" "+"precio es "+  pedidos.get(2).getPuno());
	        	System.out.println("Pedido1: Pizzas " + pedidos.get(3).getPizzas().getSabores() + " " + pedidos.get(3).getPizzas().getPorciones() 
        				+" "+ "porciones" + " "+"Bebida " + pedidos.get(3).getBebidas().getTipo() +" "+ pedidos.get(3).getBebidas().getSabores() + 
        				" "+"precio es "+  pedidos.get(3).getPuno());
	        	
	        	
	        	System.out.println("Pedido3: Lasagnas " + pedido.get(1).getLasagnas().getSabores() + " " + pedidos.get(1).getPizzas().getPorciones()
	        			+" "+ "porciones" +" "+"Bebida " + pedido.get(1).getBebidas().getTipo() + pedidos.get(1).getBebidas().getSabores() + " " 
	        			+ "precio es "+  pedido.get(1).getPdos());
	        	System.out.println("Pedido3: Lasagnas " + pedido.get(2).getLasagnas().getSabores() + " " + pedidos.get(2).getPizzas().getPorciones()
	        			+" "+ "porciones" +" "+"Bebida " + pedido.get(2).getBebidas().getTipo() + pedidos.get(2).getBebidas().getSabores() + " " 
	        			+ "precio es "+  pedido.get(2).getPdos());
				
		}
		
		       
}
		
