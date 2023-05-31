package Vetor02;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		Product[] vect = new Product[n];
		
		for (int i=0; i<n; i++) {
			entrada.nextInt();
			String name = entrada.nextLine();
			double price = entrada.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double soma = 0.0;
		for ( int i=0; i<n; i++) {
			soma += vect[i].getPrice();
		}
		
		double media = soma / n;
		
		System.out.printf("Média de preço: %.2f%n", media);
		
		
		
		
		entrada.close();
			
		
	}

}
