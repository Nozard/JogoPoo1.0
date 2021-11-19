package personagems;

import Armas.Crossbow;
import Armas.Longbow;
import Armas.Weapons;

public class Archer extends Character {
	
	private Weapons arma;
	
	public Archer(String nome) {
		super(160, 20, 30, nome);
	}
	
	public void setArma(int armaEscolhida) {
		switch (armaEscolhida) {
			case 1: {
				arma = new Longbow();
				break;
			}
			case 2: {
				arma = new Crossbow();
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
