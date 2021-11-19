package personagems;



public class Dragon{

	private double hp;
	private int ataque;
	private int defesa;
	private String nome;

	public Dragon() {
		this.hp = 300;
		this.ataque = 60;
		this.defesa = 30;
		this.nome ="LazyProg";
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
}
