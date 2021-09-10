package fundamentos.exercicios;


import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		// pegar o peso
		// pegar a altura
		// < 16 magreza grave
		// 16 a < 17 magreza moderada
		// 17 a < 18,5 magreza leve
		// 18 a < 25 saudável
		// 25 a < 30 Sobrepeso
		// 30 a < 35 Obesidade Grau I
		// 35 a < 40 Obesidade Grau II (severa)
		// >= 40 Obesidade Grau III (mórbida)
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Por favor, digite seu peso? ");
		double valorPeso = entrada.nextDouble();
		
		System.out.print("Por favor, digite sua altura? ");
		double valorAltura = entrada.nextDouble();
		
		
		System.out.println(valorPeso);
		System.out.println(valorAltura);
		
		double resultadoImc = (valorPeso) / (valorAltura * 2); 
		
		
		System.out.printf("%.2f", resultadoImc);
		
		if(resultadoImc <= 16) {
			System.out.println(" Magreza grave");
		} else if (resultadoImc > 16 && resultadoImc <= 17) {
			System.out.println(" Magreza moderada");
		} else if (resultadoImc > 17 && resultadoImc <= 19) {
			System.out.println(" Magreza leve");
		} else if (resultadoImc > 19 && resultadoImc <= 25) {
			System.out.println(" Saudável");
		} else if (resultadoImc > 25 && resultadoImc <= 30) {
			System.out.println(" Sobrepeso");
		} else if (resultadoImc > 30 && resultadoImc <= 35) {
			System.out.println(" Obesidade Grau I");
		} else if (resultadoImc > 35 && resultadoImc <= 40) {
			System.out.println(" Obesidade Grau II (severa)");
		} else if (resultadoImc > 40) {
			System.out.println(" Obesidade Grau III (mórbida)");
		}
		
		entrada.close();
	}
	
}
