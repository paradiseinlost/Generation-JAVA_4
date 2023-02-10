package Aulajava3;

import java.util.Scanner;

public class exerciciodowhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numero;
int positivo = 0;

Scanner leia = new Scanner(System.in);

System.out.println("\nEntre com um numero: ");
numero=leia.nextInt();

    do
    {
    if (numero>=0) {	
    	
    	
    	
		positivo+=numero;
    }	
    System.out.println("\nEntre com um numero: ");
    numero=leia.nextInt();
	
		
	}
    while(numero!=0);
    
    System.out.println("\nA soma acima dos numeros digitados é : "+positivo);
   
	}  	
}
