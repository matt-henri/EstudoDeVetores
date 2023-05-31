package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos produtos deseja lista? ");
		int n = entrada.nextInt();
		Product[] vect = new Product[n];
		
		for (int i=0; i<vect.length; i++) {
			entrada.nextLine();
			System.out.print("Nome do produto: ");
			String name = entrada.nextLine();
			System.out.print("Preço do produto: ");
			double price = entrada.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double soma = 0.0;
		for ( int i=0; i<vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		double media = soma / n;
		
		System.out.printf("Média de preço: %.2f%n", media);
		
		
		
		
		entrada.close();
			
		
	}

}