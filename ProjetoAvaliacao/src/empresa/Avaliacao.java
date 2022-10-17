package empresa;

public class Avaliacao {
	
	double nota1;
	double nota2;
	double nota3;
	
	Avaliacao(){
		/*precisa ter esse construtor vazio tbm caso tenha sido feito o contrutor abaixo.
		A partir do momento que foi feito o abaixo, deixa de existir o construtor 
		vazio que não aparece*/
	}
	
	
	 Avaliacao(double nota1, double nota2, double nota3) {
		 this.nota1 = nota1;
		 this.nota2 = nota2;
		 this.nota3 = nota3;
	}

	public double mediaAritmetica() {
		return(nota1+nota2+nota3)/3;
	}
	
	public double mediaPonderada() {
		return((nota1*2) + (nota2*3) + (nota3*4))/9;
	}
	

}
