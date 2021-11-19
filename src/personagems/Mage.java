package personagems;

import Armas.Staff;
import Armas.Wand;
import Armas.Weapons;

public class Mage extends Character {

	private Weapons arma;
	
	public Mage(String nome) {
		super(200, 20, 10, nome);
	}

	public void setArma(int armaEscolhida) {
		switch (armaEscolhida) {
			case 1: {
				arma = new Wand();
				break;
			}
			case 2: {
				arma = new Staff();
				break;
			}
		}
	}

	public Weapons getArma() {
		return arma;
	}
	
	public int getAtaque(){
		return super.getAtaque() + arma.getAtaque();
	}
	
	public int getDefesa(){
		return super.getDefesa() + arma.getDefesa();
	}
	
	public String toString() {
		System.out.println("Nome: " + super.getNome());
		System.out.println("Vida: " + super.getHp());
		System.out.println("Ataque: " + getAtaque());
		System.out.println("Defesa: " + getDefesa());
		System.out.println("Arma: " + arma.getNome());
		System.out.println("\n\n");
		return null;
	}

}
