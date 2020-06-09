import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		
				
		exibeCódigo();
			
	}
	public static void exibeCódigo() {
		
Scanner leitor = new Scanner(System.in);
		
		int x, y;
		double soma = 0;
		
		System.out.println("Digite um número inteiro: ");	
		x = leitor.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		y = leitor.nextInt();
		
		
		if (x < y) {
			
			do {
				
				soma = x + soma;
				x++;
			
		}
		
		while (x < y);
			System.out.println("A soma dos dois números é igual a: "+ (soma + y));}
		
		if (x > y) {
			
			do {
				
				soma = y + soma;
				y++;
			
		}
		
			while (y < x);
				System.out.println("A soma dos dois números é igual a: "+ (soma + x));};
		
		
		
		
		
	}
}
