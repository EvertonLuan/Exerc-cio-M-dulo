import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		
				
		exibeC�digo();
			
	}
	public static void exibeC�digo() {
		
Scanner leitor = new Scanner(System.in);
		
		int x, y;
		double soma = 0;
		
		System.out.println("Digite um n�mero inteiro: ");	
		x = leitor.nextInt();
		
		System.out.println("Digite outro n�mero inteiro: ");
		y = leitor.nextInt();
		
		
		if (x < y) {
			
			do {
				
				soma = x + soma;
				x++;
			
		}
		
		while (x < y);
			System.out.println("A soma dos dois n�meros � igual a: "+ (soma + y));}
		
		if (x > y) {
			
			do {
				
				soma = y + soma;
				y++;
			
		}
		
			while (y < x);
				System.out.println("A soma dos dois n�meros � igual a: "+ (soma + x));};
		
		
		
		
		
	}
}
