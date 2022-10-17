package empresa;

public class Nota {
	private double n1;
	private double n2;
	private int faltas;
	
	public Nota() {
		
	}
	
	
	public Nota(double n1, double n2, int faltas) {
		setN1(n1);
		setN2(n2);
		setFaltas(faltas);
	}

	void resultado() {
		
		double media = (n1 + n2)/ 2;
		
		System.out.println("Media: " + media);
		if(faltas>7) {
			System.out.println("Reprovado por faltas.");
		}
		else if(media<4) {
			System.out.println("Reprovado por notas!");
		}
		else if(media<7) {
			System.out.println("Exame Final!");
		}
		else {
			System.out.println("Aprovado!");
		}
		
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		if(n1<0 || n1>10) {
			System.out.println("Nota inválida.");
			return;
		}
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		if(n2<0 || n2>10) {
			System.out.println("Nota inválida.");
			return;
		}
		this.n2 = n2;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		if(faltas>40 || faltas<0) {
			System.out.println("Numero de faltas invalido");
			return;
		}
		this.faltas = faltas;
	}
	
	
}
