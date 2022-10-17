package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Nota mimosa = new Nota();
		
		
		Nota ana = new Nota();
		ana.setN1(9);
		ana.setN2(10);
		ana.setFaltas(2);
		
		ana.resultado();
		
		ana.setN1(2);
		ana.setFaltas(8);
		ana.resultado();
	}

}
