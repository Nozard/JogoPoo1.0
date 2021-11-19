package Menus;

import java.util.Scanner;

import personagems.Archer;
import personagems.Character;
import personagems.Mage;
import personagems.Warrior;

public class Charselect{
    Scanner entrada = new Scanner(System.in);
	
    
    //metodo para criar um personagem
	public Character createChar() {
		System.out.println("Escola um personagem para sua jornada:");
		System.out.println("1-Mago");
		System.out.println("2-Guerreiro");
		System.out.println("3-Arqueiro");
		int selectedChar = entrada.nextInt();
		while(selectedChar != 1 && selectedChar != 2 && selectedChar !=3) {
			System.out.print("Opção invalida, escolha novamente:");
			selectedChar = entrada.nextInt();
		}
		
		switch (selectedChar) {
			case 1: {
				System.out.print("Escola um nome para seu Mago: ");
				Mage mago = new Mage(entrada.next());
				System.out.println("Escola uma arma para seu Mago:");
				System.out.println("1- Varinha ATQ +16 | DEF +9");
				System.out.println("2- Cajado ATQ +13 | DEF +12");
				int armaEscolhida = entrada.nextInt();
				while(armaEscolhida != 1 && armaEscolhida != 2) {
					System.out.print("Opção incorreta, digite novamente: ");
					armaEscolhida = entrada.nextInt();
				}
				mago.setArma(armaEscolhida);
				return mago;
			}
			case 2: {
				System.out.print("Escola um nome para seu Guerreiro");
				Warrior guerreiro = new Warrior(entrada.next());
				System.out.println("Escola uma arma para seu Guerreiro:");
				System.out.println("1- Espada ATQ +10 | DEF +15");
				System.out.println("2- Machado ATQ +17 | DEF +8");
				int armaEscolhida = entrada.nextInt();
				while(armaEscolhida != 1 && armaEscolhida != 2) {
					System.out.print("Opção incorreta, digite novamente: ");
					armaEscolhida = entrada.nextInt();
				}
				guerreiro.setArma(armaEscolhida);
				return guerreiro;
			}
			case 3: {
				System.out.print("Escola um nome para seu Arqueiro");
				Archer arqueiro = new Archer(entrada.next());
				System.out.println("Escola uma arma para seu Arqueiro:");
				System.out.println("1- Arco Longo ATQ +12 | DEF +13");
				System.out.println("2- Balestra ATQ +15 | DEF +10");
				int armaEscolhida = entrada.nextInt();
				while(armaEscolhida != 1 && armaEscolhida != 2) {
					System.out.print("Opção incorreta, digite novamente: ");
					armaEscolhida = entrada.nextInt();
				}
				arqueiro.setArma(armaEscolhida);
				return arqueiro;
			}
		}
	
		return null;
	}
}