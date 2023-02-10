package Aulajava3;

import java.util.Scanner;

public class Exercicio2while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int idade;
	int menor21=0;
	int maior50=0;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nDigite a idade : ");
	idade=leia.nextInt();
	
	while (idade>0)
	{
		if(idade<=21) {
			
			menor21++;			
		}
		
			if (idade>=50) {
			
		maior50++;				
		}
			System.out.println("\nDigite a idade : ");
			idade=leia.nextInt();			
						
			}
System.out.println("\nMenores de 21: "+menor21);
System.out.println("\nMaiores de 50: "+maior50);
		
	}

}
