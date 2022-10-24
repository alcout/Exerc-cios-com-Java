package empresa;

public class Euro extends Moeda {//classe herdada de moeda, por isso é usado o extends

	public Euro(double valor) {
		super(valor);
	}

	@Override
	double converter() {
		double total = valor * 5.15;
		return total;
	}

	@Override
	void info() {
		System.out.println("Euro " + this.valor);
	}

}
