
package Menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import personagems.Character;
import personagems.Dragon;

public class Game {	
	private List<Character> personagens = new ArrayList<Character>();

	//instancia de objeto
	Dragon dragao = new Dragon(); 

	public List<Character> getPersonagens() {
		return personagens;
	}

	public void addPersonagem(Character personagem) {
		this.personagens.add(personagem);
	}

	public int personagensSize() {
		return personagens.size();
	}

	public void personagensToString() {
		for(Character personagemDaLista : personagens) {
			personagemDaLista.toString();
		}	
	}

	public void startGame() {
		Random random = new Random();
		Scanner entrada = new Scanner(System.in);
		int turno = 0, escolhaTurno;
		while(personagens.size() != 0 && dragao.getHp() > 0){
			turno ++;
			for(Character personagemLista: personagens) {
				System.out.println(personagemLista.getNome() + " escolha uma ação para o turno " + turno);
				System.out.println("1-Atacar");
				System.out.println("2-Defender");
				escolhaTurno = entrada.nextInt();
				while(escolhaTurno != 1 && escolhaTurno != 2) {
					System.out.print("Opção invalida, escolha novamente: ");
					escolhaTurno = entrada.nextInt();
				}
				//Aqui é feita a escolha de ação de um personagem em X turno
				switch (escolhaTurno) {
					case 1: {
						dragao.setHp(dragao.getHp() -(personagemLista.getAtaque()-dragao.getDefesa()));
						System.out.println(personagemLista.getNome() + " voce atacou o dragão, dexando-o com " + dragao.getHp() + " de vida");
						break;
					}
					case 2: {
						//aqui a defesa do personagem é aumentada caso ele escolha se defender
						personagemLista.setDefesaComEscudo(personagemLista.getDefesa()*1.1);
					}
				}
			}
			
			int dano;
			if(dragao.getHp()>0) {
				int pA = random.nextInt(personagens.size());
				//se a defesa com escudo for maior que 0, o personagem vai se defender com o escudo (defesa + 10%)
				//e nao com a sua defesa normal
				if(personagens.get(pA).getDefesaComEscudo() != 0) {
					personagens.get(pA).setHp(personagens.get(pA).getHp()-(dano = (int) (dragao.getAtaque()-personagens.get(pA).getDefesaComEscudo()<=0 ? 0 : dragao.getAtaque()-personagens.get(pA).getDefesaComEscudo())));
				}else {
					personagens.get(pA).setHp(personagens.get(pA).getHp()-(dano = (int) (dragao.getAtaque()-personagens.get(pA).getDefesaComEscudo()<=0 ? 0 : dragao.getAtaque()-personagens.get(pA).getDefesa())));
				}
				System.out.println(personagens.get(pA).getNome() + " voce foi atacado, ficando com " + personagens.get(pA).getHp() + " de vida");
			}
			resetDefense();
			checkIfCharacterIsDead();
		}
		checkWhoWins();
	}

	//usado para resetar a defesa com escudo depois de cada turno
	public void resetDefense() {
		for(Character personagemLista : personagens) {
			personagemLista.setDefesaComEscudo(0);
		}
	}

	//usado para verificar se algum personagem morreu após um turno, se sim, retira-lo da lista de personagens
	public void checkIfCharacterIsDead() {
		for(int i= 0; i<personagens.size(); i++) {
			if(personagens.get(i).getHp()<=0) {
				System.out.println(personagens.get(i).getNome() + " morreu, seu corpo foi engolido pelo dragão.");
				personagens.remove(i);
			}
		}
	}

	//após o final dos turnos, checa quem venceu;
	public void checkWhoWins() {
		if(dragao.getHp()<=0) {
			System.out.println("Parabens voce derrotou o dragao !!!");
		}else {
			System.out.println("O dragão engoliu todos os seus personagens !!!");
		}
	}

}
