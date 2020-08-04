import java.util.Scanner;

public class Calculadora {
	public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
     int numero1;
        int numero2;
            System.out.print("Digite o primeiro numero: ");
            numero1 = entrada.nextInt();
            System.out.print("Digite o segundo numero: ");
            numero2 = entrada.nextInt();
    
    System.out.println();
                System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2) );
                    System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2) );
                        System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2) );
                            System.out.println(numero1 + "/" + numero2 + "=" + (numero1 / numero2) );
	}
}