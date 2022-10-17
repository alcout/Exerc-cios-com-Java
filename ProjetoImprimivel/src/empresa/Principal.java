package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		funcionario f = new funcionario("Ana","111.222.55-85");
		carro c = new carro("gol","branco",4);
		Quadrado q = new Quadrado(10);
		
		
		ArrayList<Imprimivel> lista = new ArrayList();
		lista.add(q);
		lista.add(c);
		lista.add(f);
		
		Imprimivel i = f;
		i.imprimir();
		i=c;
		i.imprimir();
		i=q;
		i.imprimir();
		

	}

}
