package empresa;

public class funcionario implements Imprimivel {
	String nome;
	String cpf;
	
	
	
	public funcionario(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}



	@Override
	public void imprimir() {
		System.out.println("Funcionário");
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("--------------------------" );

		
		
	}
}
