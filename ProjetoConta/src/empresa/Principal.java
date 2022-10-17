package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Ana", 5000);
		Conta c2 = new Conta ("mimosa", 2000);
		
		c1.info();
		c2.info();
		c1.transferir(400, c2);
		c1.info();
		c2.info();

	
	}

}
