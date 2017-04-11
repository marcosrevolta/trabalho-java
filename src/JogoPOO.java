import java.util.Scanner;
import java.util.Random;

public class JogoPOO {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        
        do{
            System.out.println("*****************");
            System.out.println("* 1 - Novo Jogo *");
            System.out.println("* 2 - Sair      *");
            System.out.println("*****************");
            opcao = leitor.nextInt();
            if(opcao == 1){
                int vidas = 1;
                int pontuacao =0;
                int nivel = 1;
                int rodada = 1;
                
                System.out.println("Tentaticas restantes"+vidas+"Pontuação"+pontuacao);
                System.out.println("Nivel"+nivel+"Rodada"+rodada);
             }
        }while(opcao != 2);
            System.out.println("Fim do Programa"); 
        
    }
    
}
