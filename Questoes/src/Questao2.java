import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		
		String entrada = s.nextLine();
		int count = 0;
		boolean possuiLetraA = false;
		for (Character letra : entrada.toCharArray()) {
			if(letra.equals('A') || letra.equals('a')) {
				possuiLetraA = true;
				count++;
			}
		}
		
		if(possuiLetraA) {
			System.out.println("A frase possui a letra A");
			System.out.println("Quantidade: " + count);
		} else {
			System.out.println("A frase não possui a letra A");
		}
	}
}
