import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
		
		exibeC�digo();
	
	}
	public static void exibeC�digo() {
		
Scanner leitor = new Scanner(System.in);
		
		
		int not1, not2, not3, not4;
		
		
		System.out.println("Digite a primeira nota: ");
		not1 = leitor.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		not2 = leitor.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		not3 = leitor.nextInt();
		
		System.out.println("Digite a quarta nota: ");
		not4 = leitor.nextInt();
		
		
		if ((not1+not2+not3+not4)/4 >=7) {
			System.out.print("Sua m�dia � "+ (not1+not2+not3+not4)/4+" e voc� foi Aprovado, parab�ns!");
		}
		
		else {
			System.out.println("Sua m�dia � "+ (not1+not2+not3+not4)/4+" e voc� foi Reprovado.");
		}
		

	}
}
