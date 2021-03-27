package DesafioControle;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		
		// declaração de variavel
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int resultado = 0 ; 
		
		
		//estrutura de repetição
		while (true) {
			System.out.println("informe um numero : ");
			num = entrada.nextInt();
			if (num > 0 ) {
				System.out.println("numero adcionado ");
				resultado = resultado + num;
				
			}else if (num < 0){ 
					System.out.println("fim do laço");
					break ; 
				}
		}
		//resposta
		System.out.println("o resultado é : " + resultado);
		
		entrada.close();
		}
}


