package estrutura.exemplo;

import java.util.HashMap;
import java.util.Map;

public class ExemploCarroMapa {

	public static void main(String[] args) {
		
		Map<String, String> mapaDeCarros = new HashMap<String, String>();
		
		mapaDeCarros.put("Marca", "Subaru");
		mapaDeCarros.put("Modelo", "Forest");
		mapaDeCarros.put("Ano", "2017");
		
		System.out.println(mapaDeCarros);
		System.out.println(mapaDeCarros.keySet());
		

	}

}
