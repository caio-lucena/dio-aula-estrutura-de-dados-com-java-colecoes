package estrutura.exemplo;

import java.util.Stack;

import estrutura.modelo.Carro;

public class ExemploCarroPilha {

	public static void main(String[] args) {
		
		Stack <Carro> pilhaDeCarros = new Stack<>();
		
		pilhaDeCarros.add(new Carro("Fiat"));
		pilhaDeCarros.add(new Carro("Toyota"));
		pilhaDeCarros.add(new Carro("Honda"));
		pilhaDeCarros.add(new Carro("Chery"));
		
		System.out.println(pilhaDeCarros);
		
		System.out.println("-----------");	
		
		pilhaDeCarros.forEach(System.out::println);		
		pilhaDeCarros.pop();
		
		System.out.println("-----------");	
		
		System.out.println(pilhaDeCarros);
		

	}

}
