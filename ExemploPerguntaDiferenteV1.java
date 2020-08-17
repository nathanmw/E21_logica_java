//importa o scanner de dados, para que este possa ser usado
import java.util.Scanner;
 
/*
 * Pedir o gênero da pessoa M ou F
 * Se for 'M' masculino, então lhe mostre a mensagem 'Bem vindo'.
 * Se for 'F' feminino, então lhe mostre a mensagem 'Bem vinda'.
 * Se for qualquer coisa, então lhe mostre a mensagem 'Bem vindx'.
 */
public class ExemploPerguntaDiferenteV1 {//declaração da classe
    
    public static void main(String[] args) {//declaração do método principal, o que será invocado ao executar a classe
        //inicia a variavel de leitura de entrada de escrita
        Scanner sc = new Scanner(System.in);
        //escreve com quebra de linha 'ln'
        System.out.println("Qual e seu genero?");
        //faz a leitura de uma entrada do teclado, do tipo texto
        String genero = sc.next();
 
       switch (genero) {
           case "M":
               System.out.println("Bem Vindo");
               break;

               case "F":
               System.out.println("Bem Vinda");
               break;
       

           default:
           System.out.println("Bem Vindx");
               break;
       }
        }
        //fecha o scanner pra não alocar recurso
        sc.close();
    }
}