package ExemploPergunta;

import java.util.Scanner;

/*
 * Pedir o gênero da pessoa M ou F
 * Se for 'M' masculino, entao lhe mostre a mensagem 'bem vindo'
 * se for 'F' feminino, entao mostre a mensagem 'bem vinda'
 */
public class Genero {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é o seu genero");
		String genero = sc.next();
		
		if(genero.equals("M")) {
			System.out.println("Bem vindo");
		} else if (genero.equals("F")) {
			System.out.println("Bem vinda");
		} else {
			System.out.println("Bem vindx");
		}	
			sc.close();
	}

}

