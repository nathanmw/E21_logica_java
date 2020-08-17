import java.util.Scanner;
/* Importação de extenção Scanner*/  
public class CalculadoraComEscolha {
    /* class nome da classe deve ser igual o nome do arquivo*/
	public static void main (String[] args) {               
    /* Metodo vod main...*/    
        double n1;
        /* Int server para usar em apenas numeros inteiros*/
        double n2;
        double soma;
        double subtracao;
        double operacao;

        Scanner sc = new Scanner(System.in);
        //escreve com quebra de linha 'ln'
        System.out.println("");
        /* Quando usado para sem nada dentro das " " para pular limha*/
        System.out.println("Digite o numero da operacao ");
        System.out.println("");
        System.out.println("1 - Somar / 2 - Subtrair");
        System.out.println("");

        operacao = sc.nextDouble();
        
        System.out.println("Digite o primeiro valor");
        n1 = sc.nextDouble();
        // digeta o primeiro valor para fazer a eperação
        System.out.println("Digite o segundo valor");
        n2 = sc.nextDouble();

        if(operacao == 1){ // 'if' é igual a se no caso 'se' operarção for igual a '1' executara n1 mais n2 
            soma = n1 + n2;
            System.out.println("Resultado da Soma: " + soma); /* depois de processar jogará na tela o resultado nesse 
            caso ele jogará a mensagem 'Resultado da Soma: ' + o vlaor da soma.*/
        }

        if(operacao == 2){ // Mesma situação que anterios porem com a subtração dos valores
            subtracao = n1 - n2;
            System.out.println("Resultado da Subtracao: " + subtracao);
        }

        //fecha o scanner pra não alocar recurso
        sc.close();

    }

}