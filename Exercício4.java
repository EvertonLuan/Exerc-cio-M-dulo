import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
		
		exibeC�digo();
	}
	public static void exibeC�digo() {

		
		
		Scanner leitor = new Scanner (System.in);
		
		
		int opr;
		double x, y;
		
		System.out.println("Digite um n�mero inteiro: ");
		x = leitor.nextDouble();
		
		System.out.println("Digite outro n�mero inteiro: ");
		y = leitor.nextDouble();
		
		System.out.println("Em sequ�ncia a opera��o: ");
		
		System.out.println("1- soma");
		
		System.out.println("2- subtra��o");
		
		System.out.println("3- divis�o");
		
		System.out.println("4- multiplica��o");
		opr = leitor.nextInt();
		
		switch (opr) {
		
		case 1:
			System.out.println("O resultado �: "+(x+y));
			break;
		case 2:
			System.out.println("O resultado �: "+(x-y));
			break;
		case 3:
			System.out.println("O resultado �: "+(x/y));
			break;
		case 4:
			System.out.println("O resultado �: "+(x*y));
			break;
		}
		
	}
}
