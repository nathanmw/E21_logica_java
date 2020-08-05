import java.util.Scanner;

public class CalculadoraEntradaDados {
	public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
    int n1;
    int n2;
    int soma;
    int subtracao;
    int multiplicacao;
    int divisao;
            System.out.print("Digite o primeiro numero: ");
            n1 = entrada.nextInt();
            System.out.print("Digite o segundo numero: ");
            n2 = entrada.nextInt();
        soma = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;

                System.out.println(O resultado da soma e : + soma);
                System.out.println(O resultado da subtracao e : + subtracao);
                System.out.println(O resultado da multiplicacao e : + multiplicacao);
                System.out.println(O resultado da divisao e : + divisao);

	}
}