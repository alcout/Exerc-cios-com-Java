package empresa;

import java.util.ArrayList;//usado para importar ArrayList

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();//instanciado uma lista de moedas

	public void adicionar(Moeda m) {
		listaMoedas.add(m);
	}

	public void remover(Moeda m) {
		listaMoedas.remove(m);
	}

	public void listar() {
		for (Moeda m : listaMoedas) {//for vai listar as moedas que estao dentro da lista de moedas
			m.info();
		}
	}

	public void totalConvertido() {
		double total = 0;
		for (Moeda m : listaMoedas) {
			total += m.converter();
		}
		System.out.println("O total convertido em Real e: " + total);

	}

}
