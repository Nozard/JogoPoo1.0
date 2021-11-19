package personagems;

public class Character {

	private double hp;
	private int ataque;
	private int defesa;
	private String nome;
	private double defesaComEscudo = 0; 
	
	public Character(double hp, int ataque, int defesa, String nome) {
		this.hp = hp;
		this.ataque = ataque;
		this.defesa = defesa;
		this.nome = nome;
	}
	
	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		System.out.println("Nome: " + getNome());
		System.out.println("Vida: " + getHp());
		System.out.println("Ataque: " + getAtaque());
		System.out.println("Defesa: " + getDefesa());
		System.out.println("\n\n");
		return null;
	}

	public double getDefesaComEscudo() {
		return defesaComEscudo;
	}

	public void setDefesaComEscudo(double defesaComEscudo) {
		this.defesaComEscudo = defesaComEscudo;
	}
}
