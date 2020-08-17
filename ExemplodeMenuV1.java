import java.util.Scanner;

/*
* Escreva um menu de seleção de animal, após selecionar, imprima o barulho que ele faz, auau, miau, piupiu...
* Em seguida comente cada linha escrita
 */

public class ExemplodeMenuV1 {//declaração da classe
    
    public static void main(String[] args) {//declaração do método principal, o que será invocado ao executar a classe
        //inicia a variavel de leitura de entrada de escrita
        Scanner sc = new Scanner(System.in);
        //escreve com quebra de linha 'ln'
        System.out.println("Selecione um animal");
        System.out.println("1 - Dog");
        System.out.println("2 - Cat");
        System.out.println("3 - Bird");
        System.out.println("4 - Horse");
        //faz a leitura de uma entrada do teclado, do tipo texto
        int option = sc.nextInt();

        switch (option) {
            case 1:
            System.out.println("AUAU");
                break;
                
            case 2:
            System.out.println("MIAUUUU");
                 break;    
            case 3:
            System.out.println("PIUPIU");
                break;

            case 4:
            System.out.println("POKOTO");
                    break;
    

            default:
            System.out.println("Quero comida arrg");
            break;
         
        
    sc.close();

        }   
    }         
    
    
}  