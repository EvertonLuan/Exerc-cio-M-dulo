import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		
		exibeCódigo();
	}
	public static void exibeCódigo() {

		
		
		Scanner leitor = new Scanner (System.in);
		
		
		int opr;
		double x, y;
		
		System.out.println("Digite um número inteiro: ");
		x = leitor.nextDouble();
		
		System.out.println("Digite outro número inteiro: ");
		y = leitor.nextDouble();
		
		System.out.println("Em sequência a operação: ");
		
		System.out.println("1- soma");
		
		System.out.println("2- subtração");
		
		System.out.println("3- divisão");
		
		System.out.println("4- multiplicação");
		opr = leitor.nextInt();
		
		switch (opr) {
		
		case 1:
			System.out.println("O resultado é: "+(x+y));
			break;
		case 2:
			System.out.println("O resultado é: "+(x-y));
			break;
		case 3:
			System.out.println("O resultado é: "+(x/y));
			break;
		case 4:
			System.out.println("O resultado é: "+(x*y));
			break;
		}
		
	}
}
