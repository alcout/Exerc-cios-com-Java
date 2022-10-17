package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Desktop compA = new Desktop(8,4,600);
		Notebook compB = new Notebook(8,4,15);
		
		Computador comp; //polimorfismo
		
		comp = compA;
		System.out.println("Valor: " + comp.calculaValor());
		System.out.println("---------------------------------");
		comp = compB;
		System.out.println("Valor: " + comp.calculaValor());
	}

}
