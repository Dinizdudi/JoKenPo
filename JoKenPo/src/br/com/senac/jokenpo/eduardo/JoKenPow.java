package br.com.senac.jokenpo.eduardo;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Eduardo Diniz
 *
 */
public class JoKenPow {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int escolha;
		int placarj = 0, placarpc = 0;
		System.out.println("JokenPOW");
		do {
			System.out.println("--------Placar--------");
			System.out.println("Jogador: " + placarj);
			System.out.println("Maquina: " + placarpc);
			System.out.println("----------------------");
			System.out.println("1. Pedra");
			System.out.println("2. Papel");
			System.out.println("3. Tesoura");
			System.out.print("Eu escolho: ");
			escolha = teclado.nextInt();
			Random sorteio = new Random();
			int pc = sorteio.nextInt(3) + 1;
			
			
			if(pc == 1) {
				System.out.println("O computador tirou 1. Pedra");
			}else if(pc ==2) {
				System.out.println("O computador tirou 2. Papel");
			}else {
				System.out.println("O computador tirou 3. tesoura");
			}
			
			
			switch (escolha) {
			case 1:
				if(pc == 1) {
					System.out.println("O jogo empatou");
				}else if(pc == 2) {
					System.out.println("Você perdeu!");
					placarpc++;
				}else if(pc == 3) {
					System.out.println("Você ganhou!");
					placarj++;
				}
				break;
			case 2:
				if(pc == 1) {
					System.out.println("Você ganhou!");
					placarj++;
				}else if(pc == 2) {
					System.out.println("O jogo empatou!");
				}else {
					System.out.println("Você perdeu!");
					placarpc++;
				}
				break;
			case 3:
				if(pc == 2) {
					System.out.println("Você ganhou!");
					placarj++;
				}else if(pc == 3) {
					System.out.println("O jogo empatou!");
				}else {
					System.out.println("Você perdeu!");
					placarpc++;
				}
				break;
			}
		} while (placarj != 2 || placarpc != 2);	
	}
}
