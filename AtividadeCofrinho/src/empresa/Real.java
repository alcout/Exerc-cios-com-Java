package empresa;

public class Real extends Moeda {//classe herdada de moeda, por isso é usado o extends
	public Real(double valor) {
		super(valor);
	}

	@Override
	double converter() {
		return valor;

	}

	@Override
	void info() {
		System.out.println("Real " + this.valor);
	}

}
