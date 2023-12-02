package estrutura.exemplo;

import java.util.ArrayList;
import java.util.List;

import estrutura.modelo.Carro;

public class ExemploCarroLista {

	public static void main(String[] args) {
		List<Carro> listaCarros = new ArrayList<Carro>();
		
		listaCarros.add(new Carro("Ford"));
		listaCarros.add(new Carro("Fiat"));
		listaCarros.add(new Carro("Renaut"));
		
		listaCarros.forEach(System.out::println);
		
		System.out.println(listaCarros.contains(new Carro("Ford")));
		System.out.println(new Carro("Ford").hashCode());
		
		System.out.println(listaCarros.get(1));
		System.out.println(listaCarros.indexOf(new Carro("Fiat")));

	}

}
