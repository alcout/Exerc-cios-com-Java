package empresa;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(251,"Ana",2000,500);
		Conta c2 = new Conta(250,"Mimosa",3000,500);
		
		c1.info();
		c1.sacar(200);
		c1.depositar(500);
		System.out.println();
		c1.info();
		
		
		
		
	}

}
