package exercicio3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Carro> carros = new ArrayList<>();
		
		carros.add(new Carro("Gol"));
		carros.add(new Carro("Polo"));
		carros.add(new Carro("Cruze"));
		carros.add(new Carro("Corolla"));
		
		Pessoa pessoa1 = new Pessoa("Jose pai");
		Pessoa pessoa2 = new Pessoa("Maria Mae");
		Pessoa pessoa3 = new Pessoa("Jose Filho");
		
		pessoa3.setPai(pessoa1); 	//pai
		pessoa3.setMae(pessoa2);	//mae
		
		
		System.out.printf("%s \nPai: %s \nMae: %s\n\n", 
								pessoa3.getNome(), 
								pessoa3.getPai().getNome(), 
								pessoa3.getMae().getNome());
		//comprou 3 carros
		pessoa3.comprar_carro(carros.get(1));
		pessoa3.comprar_carro(carros.get(2));
		pessoa3.comprar_carro(carros.get(3));
		
		System.out.printf("\nCarros de %s:\n", pessoa3.getNome());
		
		mostrar(pessoa3.getCarros());
		
		//vendeu 1
		pessoa3.vender_carro(carros.get(2));
		
		System.out.printf("\nCarros de %s:\n", pessoa3.getNome());
				
		mostrar(pessoa3.getCarros());
		

	}
	
	public static void mostrar(ArrayList<Carro> lista) {
		for (Carro c: lista)
			System.out.println(c.getNome());
	}

}
