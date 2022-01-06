package dio.listLista;

import java.util.ArrayList;
import java.util.List;

public class Exec {

	public static void main(String[] args) {
		
		// cria a lista de carros e atribui na interface ArrayList.
		List<Carro> listaCarros = new ArrayList<>();
		
		// objetos.
		listaCarros.add(new Carro("Ford"));
		listaCarros.add(new Carro("Fiat"));
		listaCarros.add(new Carro("Chevrolet"));
		listaCarros.add(new Carro("Peugeot"));

		// imprime a lista de objetos.
		System.out.println(listaCarros);
		
		// pega o objeto no indice passado pelo metodo get.
		System.out.println(listaCarros.get(2));
		
		System.out.println(listaCarros);
		
		// imprime os objetos pelo metodo toString.
		System.out.println(listaCarros.toString());
		
		// indica o indice que esta o objeto passado com metodo indexOf quando o objeto nao e encontrado retorna (-1).
		System.out.println(listaCarros.indexOf(new Carro("Chevrolet")));
		
		// remove o objeto com metodo remove pegando pelo valor do atributo Marca.
		System.out.println(listaCarros.remove(listaCarros.indexOf(new Carro("Fiat"))));
		
		System.out.println(listaCarros);
		
		// remove o objeto com metodo remove pelo indice passado no metodo get.
		System.out.println(listaCarros.remove(listaCarros.get(2)));
		
		System.out.println(listaCarros);
	}

}
