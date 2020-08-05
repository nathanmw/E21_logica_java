import java.util.Scanner;

public class CalcularMedia {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
    double nota1;
    double nota2;
    double nota3;    
    double nota4;    
    double soma;
    double media;
            System.out.print("Digite a primeira: nota: ");
            nota1 = sc.nextDouble();
            System.out.print("Digite a sgunda nota: ");
            nota2 = sc.nextDouble();
            System.out.print("Digite a terceira: nota: ");
            nota3 = sc.nextDouble();
            System.out.print("Digite a quarta nota: ");
            nota4 = sc.nextDouble();
        soma = nota1 + nota2 + nota3 + nota4;
        media = soma / 4;

                System.out.println("O resultado da Media e: " + media);
            sc.close();

	}
}