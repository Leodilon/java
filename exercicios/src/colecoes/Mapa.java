package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuario = new HashMap<Integer, String>();
		
		usuario.put(1, "Roberto"); //metodo put() adiciona se nao existir ou atualiza se a chave ja existir
		usuario.put(2, "Rebeca");
		usuario.put(3, "Ricardo");
		usuario.put(4, "Rafaela");
		
		System.out.println(usuario.size()); //retorna o tamanho
		System.out.println(usuario.isEmpty()); //retorna se esta vazio
		
		System.out.println(usuario.keySet()); //retorna todas as chaves
		System.out.println(usuario.values()); //retorna todos os valores
		System.out.println(usuario.entrySet()); //retorna a chave e os valores
		
		System.out.println(usuario.containsKey(2)); //verifica se a chave existe
		System.out.println(usuario.containsValue("Rebeca")); //verifica se o valor existe
		
		System.out.println(usuario.get(1)); //retorna o valor associado a chave
		
		for (int chaves : usuario.keySet()) { //retorna todas as chaves
			System.out.println(chaves);
		}
		
		for (String valores : usuario.values()) { //retorna todos os valores
			System.out.println(valores);
		}
		
		for (Entry<Integer, String> registro : usuario.entrySet()) { //retorna chave e valor
			System.out.print(registro.getKey() + " -> ");
			System.out.println(registro.getValue());
		}
	}

}
