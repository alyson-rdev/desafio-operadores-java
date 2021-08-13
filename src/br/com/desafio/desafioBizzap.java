package br.com.desafio;

import java.util.Scanner;

public class desafioBizzap {
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	int primeiroValor, segundoValor;
	char op;
	
	System.out.println("Digite o primeiro valor: ");
	primeiroValor = teclado.nextInt();
	
	System.out.println("Digite o segundo valor: ");
	segundoValor = teclado.nextInt();
	
	System.out.println("Digite o operador: ");
	op = teclado.next().charAt(0);
	
	switch(op) {
	case '+':
		int resultado = primeiroValor + segundoValor;
		System.out.println("A soma entre os dois valores é: " + resultado);
		break;
	case '*':
		resultado = primeiroValor * segundoValor;
		System.out.println("A multiplicação entre os dois valores é: " + resultado);
		break;
	case '-':
		resultado = primeiroValor - segundoValor;
		System.out.println("A subtração entre os dois valores é: " + resultado);
		break;
	case '/':
		resultado = primeiroValor / segundoValor;
		System.out.println("A divisão entre os dois valores é: " + resultado);
		
	}
	
	
	
}
}