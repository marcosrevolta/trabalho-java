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
            	
                int vidas = 3;
                int pontuacao = 0;
                int nivel = 1;
                int respostasCertas = 0;
                
                System.out.println("Tentativas restantes: " + vidas + " // Pontuacao: " + pontuacao);
                System.out.println("Nivel "+nivel+"Rodada "+rodada);
                

                //  NIVEL UM



                for (int i = 0; i < 10; i++) {


                    if(vidas > 0){

                        int num1 = gerador.nextInt(50);
                        int num2 = gerador.nextInt(50);
                        int total = num1 + num2;

                        System.out.println(num1 + "Pergunta " + (i + 1) + ":");
                        System.out.println(num1 + " + " + num2);
                        int resposta = leitor.nextInt();

                        if(resposta == total){

                            // certa resposta
                            respostasCertas = (respostasCertas + 1);
                            pontuacao = pontuacao + 100;
                            

                        } else {

                            System.out.println("Como diria o Faustão: ERROOOOOOOOO")
                            vidas = (vidas - 1);

                        }

                    } else {

                        System.out.println("GAME. FUCKING. OVER.")

                    }
                    
                } 

                //  NIVEL DOIS
                for (int i = 0; i < 10; i++) {

                    
                    
                } 



                
                System.out.println("Pontuação: " + pontuacao);
                
             }
        } while(opcao != 2);
            System.out.println("Fim do Programa"); 
        
    }
    
}
