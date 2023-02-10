package Aulajava3;

import java.util.Scanner;

public class Exercicio1for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int numero;
	int par=0;
	int impar=0;
	int x;
	
	Scanner leia= new Scanner (System.in);
	
	for (x=1;x<=10;x++)// Aqui eu estou fazendo as regras do meu looping, mandando ele rodar 10 vezes, e colocando o "x++" para que ele entenda e consiga fazer essa volta.
	
	{
	System.out.println("\nDigite um numero: ");
	numero=leia.nextInt();
	 
	if (numero%2==0) {
		par++;
	}
	else {
		impar++;
		
	}
							
	}
		
	System.out.println("\nvocê digitou "+par+"  numeros pares");
	System.out.println("\nvocê digitou "+impar+" numeros impares");
	
		
		
		
	}

}
