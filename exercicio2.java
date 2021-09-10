package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		// (60°C × 9/5) + 32 = 140°F
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor = ");
		int tempPrimaria = entrada.nextInt();
		float constante1 = 9/5.0F;
		int constante2 = 32;
		//System.out.println(constante1);
		double tempSecundaria = ((tempPrimaria * constante1) + constante2);
		
		System.out.println(tempSecundaria 
				+ " á temperatura em Fahrenheit.");
	}
}
