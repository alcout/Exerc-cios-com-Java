package empresa;

public class Dolar extends Moeda{//classe herdada de moeda, por isso é usado o extends

	public Dolar(double valor) {
		super(valor);
	}

	@Override//reescreve um metodo que foi herdado
	double converter() {
		double total = valor * 5.27;
		return total;
	}

	@Override
	void info() {
		System.out.println("Dolar " + this.valor);
	}
	
	

}
