package comparacao.exemplo;

import java.util.LinkedList;
import java.util.Queue;

import comparacao.modelo.Carro;

public class ExemploCarroFila {

	public static void main(String[] args) {
		
		Queue<Carro> filaDeCarros = new LinkedList<>();
		
		filaDeCarros.add(new Carro("Chevrolet"));
		filaDeCarros.add(new Carro("Subaru"));
		filaDeCarros.add(new Carro("Dodge"));
		
		System.out.println("-----");
		filaDeCarros.forEach(System.out::println);
		
		System.out.println(filaDeCarros.offer(new Carro("Renault")));
		System.out.println(filaDeCarros.peek());
		
		System.out.println("-----");
		filaDeCarros.forEach(System.out::println);
		
		System.out.println("-----");
		System.out.println(filaDeCarros.poll());
		
		System.out.println("-----");		
		filaDeCarros.forEach(System.out::println);

	}

}
