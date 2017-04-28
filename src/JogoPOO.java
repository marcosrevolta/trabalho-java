import java.util.Scanner;
import java.util.Random;

public class JogoPOO {
	public static double arrendondar(double valor){
		return (double) Math.round(valor * 100) / 100;
	}
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
                int respostasCertas = 0;
                int rodada = 1;
                
                System.out.println("Tentativas restantes: " + vidas + " // Pontuacao: " + pontuacao);
                

                //  NIVEL UM
                System.out.println("--- NÍVEL UM ---");
                for (int i = 0; i < 10; i++) {


                    if(vidas > 0){

                    	int rand = gerador.nextInt(2);
                    	int num1 = gerador.nextInt(10);
                        int num2 = gerador.nextInt(10);                        
                        int total = 0;
                        
                        System.out.println("----------------------------------");
                        System.out.println("Pergunta " + (i + 1) + ": ");
                        
                        if(rand % 2 == 0){
                        	System.out.println(num1 + " + " + num2);
                        	total = (num1 + num2);
                        } else {
                        	System.out.println(num1 + " - " + num2);
                        	total = (num1 - num2);
                        }                       
                        
                        int resposta = leitor.nextInt();

                        if(resposta == total){

                            respostasCertas = (respostasCertas + 1);
                            rodada = (rodada + 1);
                            pontuacao = pontuacao + 100;
                            System.out.println("Acertô Miserávi");

                        } else {

                            System.out.println("Como diria o Faustão: ERROOOOOOOOO");
                            vidas = (vidas - 1);
                            System.out.println("Vidas: " + vidas);
                            System.out.println("----------------------------------");

                        }

                    } else {

                        System.out.println("GAME. FUCKING. OVER.");

                    }
                    
                } 
                
                System.out.println("Pontuação: " + pontuacao);
                
                //  NIVEL DOIS
                System.out.println("--- NÍVEL DOIS ---");
                for (int i = 0; i < 10; i++) {                	
                    if(vidas > 0){

                    	int num1 = gerador.nextInt(10);
                        int num2 = gerador.nextInt(10);                        
                        int total = (num1 * num2);
                        
                        System.out.println("----------------------------------");
                        System.out.println("Pergunta " + (i + 1) + ": ");                        
                        System.out.println(num1 + " * " + num2);
                        int resposta = leitor.nextInt();

                        if(resposta == total){

                            respostasCertas = (respostasCertas + 1);
                            rodada = (rodada + 1);
                            pontuacao = pontuacao + 200;  
                            System.out.println("Acertô Miserávi");

                        } else {

                            System.out.println("Como diria o Faustão: ERROOOOOOOOO");
                            vidas = (vidas - 1);
                            System.out.println("Vidas: " + vidas);
                            System.out.println("----------------------------------");

                        }

                    } else {

                        System.out.println("GAME. FUCKING. OVER.");

                    }
                }                
                    
                System.out.println("Pontuação: " + pontuacao);
                
                
                //  NIVEL TRÊS
                System.out.println("--- NÍVEL TRÊS---");
                for (int i = 0; i < 10; i++) {                	
                    if(vidas > 0){

                    	double num1 = gerador.nextInt(9)+1;
                        double num2 = gerador.nextInt(9)+1;                        
                        float total = (float) arrendondar(num1 / num2);
                        
                        System.out.println("----------------------------------");
                        System.out.println("Pergunta " + (i + 1) + ": ");                        
                        System.out.println(num1 + " / " + num2);
                        
                        System.out.println("(Se precisar, no máximo duas casas decimais e separar decimais com ponto)");
                        float resposta = Float.parseFloat(leitor.next());
                        //float resposta = leitor.nex

                        if(resposta <= total+0.2 && resposta >= total-0.2 ){

                            respostasCertas = (respostasCertas + 1);
                            rodada = (rodada + 1);
                            pontuacao = pontuacao + 250;  
                            System.out.println("Acertô Miserávi");

                        } else {

                            System.out.println("Como diria o Faustão: ERROOOOOOOOO");
                            vidas = (vidas - 1);
                            System.out.println("Vidas: " + vidas);
                            System.out.println("----------------------------------");

                        }

                    } else {

                        System.out.println("GAME. FUCKING. OVER.");

                    }
                }
                
                
	            //  NIVEL QUATRO
	            System.out.println("--- NÍVEL QUATRO---");
	            for (int i = 0; i < 10; i++) {                	
	                if(vidas > 0){
	
	                	double rand = gerador.nextInt(99)+1;
	                	double num1 = gerador.nextInt(99)+1;
	                    double num2 = gerador.nextInt(99)+1;
	                    double total = 0;
	                    
	                    System.out.println("----------------------------------");
	                    System.out.println("Pergunta " + (i + 1) + ": ");
	                    
	                    if(rand > 25){	                    	
	                    	if(rand > 50){	                    		
	                    		if(rand > 75){           
	                                System.out.println(num1 + " * " + num2);
	                                total = (num1 * num2);	                    			
	                    		} else {	                    			
	                    			System.out.println(num1 + " / " + num2);
	                    			System.out.println("(Se precisar, no máximo duas casas decimais e separar decimais com ponto)");
	                    			total = arrendondar(num1 / num2);	                    			
	                    		}	                    		
	                    	} else {	                    		
	                    		System.out.println(num1 + " + " + num2);
	                    		total = (num1 + num2);
	                    	}	                    	
	                    } else {	                    	
	                    	System.out.println(num1 + " - " + num2);
	                    	total = (num1 - num2);
	                    }
	                    
	                    double resposta = Double.parseDouble(leitor.next());
	
	                    if(resposta == total){
	
	                        respostasCertas = (respostasCertas + 1);
	                        rodada = (rodada + 1);
	                        pontuacao = pontuacao + 300; 
	                        System.out.println("Acertô Miserávi");
	
	                    } else {
	
	                        System.out.println("Como diria o Faustão: ERROOOOOOOOO");
	                        vidas = (vidas - 1);
	                        System.out.println("Vidas: " + vidas);
	                        System.out.println("----------------------------------");
	
	                    }
	
	                } else {
	
	                    System.out.println("GAME. FUCKING. OVER.");
	
	                }
	            }
            
                                    
                System.out.println("ACABOU O GAME, PARABENS CE ACERTOU TUDO AS PERGUNTA");
                
                // BONUS DE RESPOSTAS CORRETAS GOES HERE
                double bonus = (respostasCertas * 1.5);
                
                System.out.println("Pontuação Final: " + (pontuacao + bonus));
                System.out.println("(Bonus: " + bonus + ")");
                
             }
        } while(opcao != 2);
            System.out.println("Fim do Programa"); 
        
    }
    
}