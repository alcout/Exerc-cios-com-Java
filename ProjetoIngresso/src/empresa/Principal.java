package empresa;

public class Principal {

	public static void main(String[] args) {
		IngressoVip iv = new IngressoVip("Rock in Curitiba", 200, 100);
		iv.info();
		
		Ingresso i=  new Ingresso("Rock in rio", 50);
		i.info();

	}

}
