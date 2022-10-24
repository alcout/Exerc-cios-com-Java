package empresa;

import java.util.Scanner;//importando para ler o console

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 1;//colocado a opcao = 1 para iniciar o looping assim que iniciar o programa
		var cofrinho = new Cofrinho();

		while (opcao != 0) {
			System.out.println("-=-=-=-=-=-" + "COFRINHO" + "-=-=-=-=-=-");
			System.out.println("1-Adicionar Moeda");
			System.out.println("2-Remover Moeda");
			System.out.println("3-Listar Moedas");
			System.out.println("4-Calcular total convertido para Real");
			System.out.println("0-Encerrar");

			opcao = teclado.nextInt();//vai ler a opção que o usuário digitar
			switch (opcao) {//estrutura para testar condições
			case 1:
				AdicionarMoeda(teclado, cofrinho);// metodo criado para adicionar moeda que passa a instancia do teclado e do cofrinho para ser usado no metodo
				break;//é necessário usar o break no fim de cada case porque se não ele vai ler todos os case
			case 2:
				RemoverMoeda(teclado, cofrinho);//tanto metodo adicionar quanto remover foi feito abaixo do switch case para a visao do switch ficar mais limpa
				break;
			case 3:
				cofrinho.listar();
				break;
			case 4:
				cofrinho.totalConvertido();
				break;
			case 0:
				System.out.println("Encerrando o programa.");
				break;
			default:
				System.out.println("Opcao invalida, tente novamente.");
			}
		}
	}

	public static void AdicionarMoeda(Scanner teclado, Cofrinho cofrinho) {
		int opcaoMoeda = 0;

		while (opcaoMoeda > 3 || opcaoMoeda <= 0) {
			System.out.println("Escolha a moeda a ser adicionada:");
			System.out.println("1-Dolar:");
			System.out.println("2-Euro:");
			System.out.println("3-Real:");
			opcaoMoeda = teclado.nextInt();
		}
		double valorMoeda;
		System.out.println("Digite o valor: ");
		valorMoeda = teclado.nextDouble();

		Moeda moedas;//criada variavel moeda para ser uma referencia
		if (opcaoMoeda == 1) {
			moedas = new Dolar(valorMoeda);
			cofrinho.adicionar(moedas);
		} else if (opcaoMoeda == 2) {
			moedas = new Euro(valorMoeda);
			cofrinho.adicionar(moedas);
		} else if (opcaoMoeda == 3) {
			moedas = new Real(valorMoeda);
			cofrinho.adicionar(moedas);
		}
	}

	public static void RemoverMoeda(Scanner teclado, Cofrinho cofrinho) {
		int opcaoMoeda = 0;

		while (opcaoMoeda > 3 || opcaoMoeda <= 0) {
			System.out.println("Escolha a moeda a ser removida:");
			System.out.println("1-Dolar:");
			System.out.println("2-Euro:");
			System.out.println("3-Real:");
			opcaoMoeda = teclado.nextInt();
		}
		double valorMoeda;
		System.out.println("Digite o valor: ");
		valorMoeda = teclado.nextDouble();

		Moeda moedas;
		if (opcaoMoeda == 1) {
			moedas = new Dolar(valorMoeda);
			cofrinho.remover(moedas);

		} else if (opcaoMoeda == 2) {
			moedas = new Euro(valorMoeda);
			cofrinho.remover(moedas);
		} else if (opcaoMoeda == 3) {
			moedas = new Real(valorMoeda);
			cofrinho.remover(moedas);
		}
	}
}
