package Menus;

import java.util.Scanner;
import Menus.Charselect;

public class Menu {
	
	public static void main(String[] args) {

		Game gameEngine = new Game();
		
	    Scanner entrada = new Scanner(System.in);
	    
	    Charselect charselect = new Charselect();
	    int gamestart = 0;
	    while(gamestart != 4) {
		    System.out.println("Bem vindo qual a sua escolha?");
		    System.out.println("1- Criar personagens");
		    System.out.println("2- Começãr o jogo");
		    System.out.println("3- Listar personagens criados");
		    System.out.println("4- Sair do jogo");
	
		    gamestart = entrada.nextInt();
		    while (gamestart != 1 && gamestart != 2 && gamestart != 3 && gamestart != 4){
		       System.out.println("opçao invalida");
		       System.out.println("Suas opçoes sao: 1, 2, 3 ou 4");
		       gamestart = entrada.nextInt();
		    }
	
	
	        switch (gamestart) {
	        case 1:{
	        	//chama o metodo da criação de personagens, caso nao tenha criado os 3 ja
	        	if(gameEngine.personagensSize() < 3) {
	        		//chama o metodo "createChar" e adiciona o personagem na lista de personagens
	        		//do objeto "gameEngine"
	        		gameEngine.addPersonagem(charselect.createChar());
	        	}else {
	        		System.out.println("Voce ja criou o numero maximo de personagens.");
	        	}
	        	break;
	        }
	        case 2:{
	        	gameEngine.startGame();
	        	break;
	        }
	        case 3:{
	        	gameEngine.personagensToString();
	        	break;
	        }
	        case 4:{
	        	gamestart = 4;
	        }
	        }
		}
	}
}