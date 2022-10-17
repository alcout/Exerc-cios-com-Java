package empresa;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Exercício 1");
		Avaliacao ana = new Avaliacao();
		Avaliacao mario = new Avaliacao(7,4,10);
		ana.nota1 = 5.2;
		ana.nota2 = 7.0;
		ana.nota3 = 10.0;
		
		
		System.out.printf("Média Aritmetica do Mario: %.2f \n " , mario.mediaAritmetica());
		System.out.printf("Média Ponderada do Mario: %.2f \n " , mario.mediaPonderada());
		
		System.out.println("Média Aritmetica do Ana: " + ana.mediaAritmetica());
		System.out.println("Média Ponderada do Ana: " + ana.mediaPonderada());
		
		System.out.println("==========================================================");
		System.out.println("Exercício 2");
		Aluno a1 = new Aluno("Ana","Fisioterapia", new Avaliacao(9,10,8));
		Aluno a2 = new Aluno("Lucia","Fisioterapia", new Avaliacao(7,6,8));
		
		a1.info();
		a2.info();
		

		
	}

}
