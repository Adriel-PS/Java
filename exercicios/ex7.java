package DesafioControle;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		
		// declara��o de variavel
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int resultado = 0 ; 
		
		
		//estrutura de repeti��o
		while (true) {
			System.out.println("informe um numero : ");
			num = entrada.nextInt();
			if (num > 0 ) {
				System.out.println("numero adcionado ");
				resultado = resultado + num;
				
			}else if (num < 0){ 
					System.out.println("fim do la�o");
					break ; 
				}
		}
		//resposta
		System.out.println("o resultado � : " + resultado);
		
		entrada.close();
		}
}


