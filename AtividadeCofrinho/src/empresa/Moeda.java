package empresa;

import java.util.Objects;

public abstract class Moeda {//classe abstrata que vai ser herdada pelos tipos de moedas
	double valor;

	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	
	abstract double converter();
	
	abstract void info();

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) {// metodo usado para comparação,usado para verificar a equivalencia de obejtos
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	
	
	
	
	


}
