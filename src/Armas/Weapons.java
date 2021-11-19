package Armas;

public class Weapons {

	private int ataque;
	private int defesa;
	private String nome;
	
	
	public Weapons(int ataque, int defesa, String nome) {
		this.ataque = ataque;
		this.defesa = defesa;
		this.nome = nome;
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
}
