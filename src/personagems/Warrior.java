package personagems;

import Armas.Axe;
import Armas.Sword;
import Armas.Weapons;

public class Warrior extends Character {

	private Weapons arma;
	
	public Warrior(String nome) {
		super(180, 30, 20, nome);
	}

	public Weapons getArma() {
		return arma;
	}

	public void setArma(int armaEscolhida) {
		switch (armaEscolhida) {
			case 1: {
				arma = new Sword();
				break;
			}
			case 2: {
				arma = new Axe();
				break;
			}
		}
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
