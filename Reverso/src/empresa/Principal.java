package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> listaNomes = new ArrayList<String>();
		System.out.println("Digite a quantidade de nomes: ");
		int quantidade = teclado.nextInt();
		String nome;
		for(int i = 0; i < quantidade; i++) {
			nome = teclado.next();
			listaNomes.add(nome);
		}
		/*for (int i=listaNomes.size()-1; i>= 0; i--) {
			System.out.println(listaNomes.get(i));
		
		}*/
		System.out.println("Ordem Normal");
		System.out.println(listaNomes);
		
		Collections.reverse(listaNomes);
		System.out.println("Ordem Reversa");
		System.out.println(listaNomes);
		
	}

}
