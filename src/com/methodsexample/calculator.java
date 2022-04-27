package com.methodsexample;


public class calculator {

	public static void soma(double i, double j) {
		
		double resultado = i + j;
		
		System.out.printf("A soma do %.2f mais %.2f é %.2f %n", i, j, resultado);
	}
	
	public static void subtracao(double i, double j) {
		
		double resultado = i - j;
		
		System.out.printf("A subtração do %.2f mais %.2f é %.2f %n", i, j, resultado);
	}
	
	public static void divisao(double i, double j) {
		
		double resultado = i / j;
		
		System.out.printf("A divisão do %.2f mais %.2f é %.2f %n", i, j, resultado);
	}
	
	public static void multiplicacao(double i, double j) {
		
		double resultado = i * j;
		
		System.out.printf("A Multiplicação do %.2f mais %.2f é %.2f %n", i, j, resultado);
	}

		
	}


