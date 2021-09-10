package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		// (20°F − 32) × 5/9 =
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor = ");
		int tempPrimaria = (int) entrada.nextDouble();
		
		int tempSecundaria = (tempPrimaria - 32) * 5/9;
		
		System.out.println(tempSecundaria + "° Celsius.");
	}
}
