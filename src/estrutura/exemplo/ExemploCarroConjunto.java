package estrutura.exemplo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import estrutura.modelo.Carro;

public class ExemploCarroConjunto {

	public static void main(String[] args) {
		
		Set<Carro> conjuntoDeCarros = new HashSet<Carro>();
		
		conjuntoDeCarros.add(new Carro("Chevrolet"));
		conjuntoDeCarros.add(new Carro("Renault"));
		conjuntoDeCarros.add(new Carro("Volks"));
		conjuntoDeCarros.add(new Carro("BMW"));
		
		conjuntoDeCarros.forEach(System.out::println);
		
		System.out.println("--------------");
		
		Set<Carro> arvoreDeCarros = new TreeSet<Carro>();
		
		arvoreDeCarros.add(new Carro("Renault"));
		arvoreDeCarros.add(new Carro("Subaru"));
		arvoreDeCarros.add(new Carro("Mercedes Benz"));
		arvoreDeCarros.add(new Carro("BMW"));
		
		System.out.println(arvoreDeCarros);		

	}

}
