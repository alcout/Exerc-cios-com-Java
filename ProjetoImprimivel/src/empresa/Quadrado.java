package empresa;

public class Quadrado implements Imprimivel{
	int medidaLado;
	
	

	public Quadrado(int medidaLado) {
		super();
		this.medidaLado = medidaLado;
	}



	@Override
	public void imprimir() {
		System.out.println("Quadrado");
		System.out.println("Medida Lado: " + medidaLado);
		System.out.println("Área: " + (medidaLado *4));
		System.out.println("--------------------------" );
	}
	

}
